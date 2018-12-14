
package com.client;

import java.net.InetSocketAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pojo.MessageProto;
import com.pojo.MessageProto.Message;
import com.utils.MessageUtil;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
<code>Client.java</code>
<p>
	TODO: 测试客户端
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月13日 上午9:56:47
	@version 1.0 
	@lastUpdate 无
</p>
*/
public class Client {
	
	
	private static final Logger logger = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) throws Exception {
		EventLoopGroup group = new NioEventLoopGroup();
		try {
			Bootstrap b = new Bootstrap();
			b.group(group)
			 .channel(NioSocketChannel.class)
			 .remoteAddress(new InetSocketAddress("localhost", 8081))
			 .handler(new ChannelInitializer<SocketChannel>() {

				@Override
				protected void initChannel(SocketChannel ch) throws Exception {
					ChannelPipeline pipeline = ch.pipeline();
					pipeline.addFirst(new LoggingHandler(LogLevel.INFO));
					pipeline.addLast(new ProtobufVarint32FrameDecoder());
					pipeline.addLast("decode", new ProtobufDecoder(MessageProto.Message.getDefaultInstance()));
					pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
					pipeline.addLast("encode", new ProtobufEncoder());
					pipeline.addLast(new ClientHandle());
				}
			});
			ChannelFuture f = b.connect().sync();
			f.channel().closeFuture().sync();
		}  finally {
			group.shutdownGracefully().sync();
		}
	}
	
	
	static class ClientHandle extends SimpleChannelInboundHandler<Message>{

		@Override
		protected void channelRead0(ChannelHandlerContext ctx, Message msg) throws Exception {
			logger.info("receive heartbeat:{}",msg.getType());
		}

		@Override
		public void channelActive(ChannelHandlerContext ctx) throws Exception {
			Message message = MessageUtil.loginMsg(1, "test1", "123456");
			ctx.writeAndFlush(message);
		}
		
		
	}
	
	
	
	
}

