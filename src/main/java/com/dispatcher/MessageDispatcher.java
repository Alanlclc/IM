
package com.dispatcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pojo.MessageProto;
import com.pojo.MessageProto.Message;
import com.service.RedisService;
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
	
	@Autowired
	private RedisService service;
	
	
	@Override
	public void sendHandle(ChannelHandlerContext ctx) {
		
	}

	@Override
	public void receiveHandle(ChannelHandlerContext ctx, MessageProto.Message message) {
		//收到客户端消息
		Integer userId = message.getId();
		if(service.checkLogin(userId)) {
			//检测到未登录直接退出
			ctx.close();
		}
		Integer targetId = message.getTargetId();
		switch (message.getTargetValue()) {
		case 0:
			//一对一消息
			Message oneToOneMsg = MessageUtil.getOneToOneMsg(userId, targetId, message.getMes());
			service.pushOneToOneMeg(userId, targetId ,oneToOneMsg);
			ctx.writeAndFlush(oneToOneMsg);
			break;
		case 1:
			//群发消息
			
			break;
		}
		
	}

}

