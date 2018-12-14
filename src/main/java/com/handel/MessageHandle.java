
package com.handel;

import java.net.InetSocketAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dispatcher.Handle;
import com.pojo.MessageProto;
import com.pojo.MessageProto.Message;
import com.pojo.MessageProto.Message.Type;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.channel.ChannelHandler.Sharable;

/**
<code>MessageHandle.java</code>
<p>
	TODO: 普通文字消息处理类
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月12日 下午3:49:06
	@version 1.0 
	@lastUpdate 无
</p>
*/
@Sharable
@Component
public class MessageHandle extends SimpleChannelInboundHandler<Message>{
	
	private static Logger logger = LoggerFactory.getLogger(MessageHandle.class);
	
	@Autowired
	private Handle heartDispatcher;

	@Autowired
	private Handle messageDispatcher;
	
	@Autowired
	private	Handle loginDispatcher;
	
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
		logger.info("{}:连接到服务器",insocket.getAddress());
	}
	
	
	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		logger.info("移出断开连接的channel");
	}



	//接收消息并分发
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Message msg) throws Exception {
		Type type = msg.getType();
		switch (type) {
		case MESSAGE:
			messageDispatcher.receiveHandle(ctx, msg);
			break;
		case HEARTBEAT:
			heartDispatcher.receiveHandle(ctx, msg);
			break;
		case IMAGE:
			loginDispatcher.receiveHandle(ctx, msg);
			break;
		default:
			break;
		}
	}
	
	
	//netty自带的默认实现 心跳发送 
	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		if(evt instanceof IdleStateEvent) {
			IdleStateEvent event = (IdleStateEvent) evt;
			switch (event.state()) {
			case ALL_IDLE:
				//发送心跳包
				heartDispatcher.sendHandle(ctx);
			default:
				break;
			}
		}
	}
	
	
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}
	
}

