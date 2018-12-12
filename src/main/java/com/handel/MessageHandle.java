
package com.handel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dispatcher.Handle;
import com.pojo.MessageProto;
import com.pojo.MessageProto.Message;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelHandler.Sharable;

/**
<code>MessageHandle.java</code>
<p>
	TODO: something to do by the file
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
public class MessageHandle extends ChannelInboundHandlerAdapter{
	
	private static Logger logger = LoggerFactory.getLogger(MessageHandle.class);
	
	@Autowired
	private Handle heartDispatcher;


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
			logger.info("don't know message");
			throw new Exception("don't know message");
		}
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}
	
}

