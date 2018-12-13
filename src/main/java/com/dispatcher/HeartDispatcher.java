
package com.dispatcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.pojo.MessageProto;
import com.pojo.MessageProto.Message;
import com.utils.MessageUtil;

import io.netty.channel.ChannelHandlerContext;

/**
<code>HeartController.java</code>
<p>
	TODO: something to do by the file
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月12日 下午2:33:50
	@version 1.0 
	@lastUpdate 无
</p>
*/
@Component("heartDispatcher")
public class HeartDispatcher implements Handle{

	private static final Logger logger = LoggerFactory.getLogger(HeartDispatcher.class);
	
	@Override
	public void sendHandle(ChannelHandlerContext ctx) {
		//发送心跳包
		Message heartBeatMsg = MessageUtil.getHeartBeatMsg(1, 2);
		logger.info("send heartbeat:" + heartBeatMsg.getType());
		ctx.writeAndFlush(heartBeatMsg);
	}

	@Override
	public void receiveHandle(ChannelHandlerContext ctx, MessageProto.Message evt) {
		//收到心跳包
		logger.info("receive heartbeat:" + evt.getType());
	}

}

