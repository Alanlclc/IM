
package com.handel;


import java.net.InetSocketAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dispatcher.Handle;
import com.pojo.MessageProto;
import com.pojo.MessageProto.Message;

import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;

/**
<code>MessageHandel</code>
<p>
	TODO: 消息处理类
</p>
<p>
	@company Amigo
	@author LuChen
	@version 1.0 
	@lastUpdate ��
</p>
*/
@Sharable
@Component
public class HeartBeatHandle extends ChannelInboundHandlerAdapter{

	private static Logger logger = LoggerFactory.getLogger(HeartBeatHandle.class);
	
	@Autowired
	private Handle heartDispatcher;
	
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
		logger.info("{}:连接到服务器",insocket.getAddress());
	}



	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		if(msg instanceof MessageProto.Message) {
			MessageProto.Message message = (Message) msg;
			if(message.getType().equals(MessageProto.Message.Type.HEARTBEAT)) {
				heartDispatcher.receiveHandle(ctx, message);
			}else {
				ctx.fireChannelRead(msg);
			}
		}else {
			throw new Exception("don't know message");
		}
	}

	
	//netty自带的默认实现 心跳发送 
	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		if(evt instanceof IdleStateEvent) {
			IdleStateEvent event = (IdleStateEvent) evt;
			switch (event.state()) {
			case READER_IDLE:
				//未进行读操作
				logger.info("READER_IDLE");
				break;
			case WRITER_IDLE:
				//未进行写操作
				logger.info("WRITER_IDLE");
				break;
			case ALL_IDLE:
				//未进行读写操作
				logger.info("ALL_IDLE");
				//发送心跳包
				heartDispatcher.sendHandle(ctx);
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

