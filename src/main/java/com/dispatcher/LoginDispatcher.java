
package com.dispatcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pojo.MessageProto.Message;
import com.service.MessageService;
import com.utils.Auth;

import io.netty.channel.ChannelHandlerContext;

/**
<code>LoginDispatcher.java</code>
<p>
	TODO: something to do by the file
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月14日 下午5:44:55
	@version 1.0 
	@lastUpdate 无
</p>
*/
@Component("loginDispatcher")
public class LoginDispatcher implements Handle {
	
	@Autowired
	private MessageService messageService;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginDispatcher.class);
	
	@Override
	public void sendHandle(ChannelHandlerContext ctx) {}

	@Override
	public void receiveHandle(ChannelHandlerContext ctx, Message evt) {
		//用户登陆校验-
		String username = evt.getMes().split("_")[0];
		String password = evt.getMes().split("_")[1];
		Integer userId = Auth.loginAuth(username, password);
		if(userId>0) {
			//通过校验
			logger.info("通过校验");
			messageService.putChannel(userId, ctx.channel());
			//拉取未读消息
			messageService.pushMessageOutLine(userId);
			logger.info("online : {}",messageService.map.size());
		}else {
			//登陆不通过  直接将登陆的channel关闭
			ctx.close();
		}
	}

}

