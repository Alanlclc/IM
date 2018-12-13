package com.listen;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.config.NettyConfig;
import com.handel.MessageHandle;
import com.pojo.MessageProto;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleStateHandler;

/**
<code>EchoServer.java</code>
<p>
	TODO: server
</p>
<p>
	@company Amigo
	@author LuChen
	@version 1.0 
</p>
*/
@Component
public class NettyServerListener{
	

	private final Logger logger = LoggerFactory.getLogger(NettyServerListener.class);
    /**
	 * bootstrap
     */
    ServerBootstrap serverBootstrap = new ServerBootstrap();
    /**
     * Boss
     */
    EventLoopGroup boss = new NioEventLoopGroup();
    /**
     * Worker
     */
    EventLoopGroup work = new NioEventLoopGroup();
    /**
     * NETT服务器配置类
     */
    @Autowired
    private NettyConfig nettyConfig;
    /**
	 * 消息处理handle
     */
    @Autowired
    private MessageHandle messageHandle;
    /**
	 * 关闭服务器方法
     */
    @PreDestroy
    public void close() {
        logger.info("关闭服务器...");
        work.shutdownGracefully();
    }
	
    /**
	 * 开启服务器方法
     */
    @PostConstruct
    public void start() {
		try {
			serverBootstrap.group(boss,work)
				.channel(NioServerSocketChannel.class)
				.option(ChannelOption.SO_BACKLOG, 100)     //并发下链路层等待队列最大长度
				.localAddress(new InetSocketAddress(nettyConfig.getPort()))
				//日志处理handle
				.childHandler(new ChannelInitializer<Channel>() {
					@Override
					protected void initChannel(Channel ch) throws Exception {
						ChannelPipeline pipeline = ch.pipeline();
						pipeline.addFirst("logger",new LoggingHandler(LogLevel.INFO));
						pipeline.addLast("removeheader",new ProtobufVarint32FrameDecoder());
						pipeline.addLast("decode", new ProtobufDecoder(MessageProto.Message.getDefaultInstance()));
						pipeline.addLast("heartBeat",new IdleStateHandler(25, 25, 10, TimeUnit.SECONDS));
						pipeline.addLast("addheader",new ProtobufVarint32LengthFieldPrepender());
						pipeline.addLast("encode", new ProtobufEncoder());
						pipeline.addLast("messageHandel", messageHandle);
					}
				});
			logger.info("server start port : {}", nettyConfig.getPort());
			ChannelFuture f = serverBootstrap.bind().sync();
			f.channel().closeFuture().sync();			
		} catch (InterruptedException e) {
			logger.info("出现异常，释放资源");
			e.printStackTrace();
			work.shutdownGracefully();
		}
    }
}
