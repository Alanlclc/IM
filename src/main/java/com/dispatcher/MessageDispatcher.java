
package com.dispatcher;

import org.springframework.stereotype.Component;

import com.pojo.MessageProto;

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
	
	@Override
	public void sendHandle(ChannelHandlerContext ctx) {
		
	}

	@Override
	public void receiveHandle(ChannelHandlerContext ctx, MessageProto.Message evt) {
		
	}

}

