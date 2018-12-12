
package com.dispatcher;

import org.springframework.stereotype.Component;

import com.pojo.MessageProto;
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

	
	@Override
	public void sendHandle(ChannelHandlerContext ctx) {
		//发送心跳包
	}

	@Override
	public void receiveHandle(ChannelHandlerContext ctx, MessageProto.Message evt) {
		//收到心跳包
	}

}

