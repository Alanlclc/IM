
package com.dispatcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pojo.MessageProto;
import com.pojo.MessageProto.Message;
import com.service.MessageService;
import com.utils.MessageUtil;

import io.netty.channel.ChannelHandlerContext;

/**
<code>MessageDispatcher.java</code>
<p>
	TODO: something to do by the file
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月12日 下午3:56:48
	@version 1.0 
	@lastUpdate 无
</p>
*/
@Component("messageDispatcher")
public class MessageDispatcher implements Handle {
	
	private static Logger logger = LoggerFactory.getLogger(MessageDispatcher.class);
	
	@Autowired
	private MessageService messageService;
	
	
	@Override
	public void sendHandle(ChannelHandlerContext ctx) {
		
	}

	@Override
	public void receiveHandle(ChannelHandlerContext ctx, MessageProto.Message message) {
		Integer userId = message.getId();
		Integer targetId = message.getTargetId();
		switch (message.getTargetValue()) {
		case 0:
			//一对一消息
			Message oneToOneMsg = MessageUtil.getOneToOneMsg(userId, targetId, message.getMes());
			logger.info("收到一对一消息");
			messageService.pushOneToOneMeg(oneToOneMsg);
			break;
		case 1:
			//群发消息
			Message msg = MessageUtil.getOneToOneMsg(userId, targetId, message.getMes());
			messageService.pushOneToManyMsg(msg);
			break;
		}
	}

}

