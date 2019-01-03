
package com.dispatcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pojo.MessageProto;

import io.netty.channel.ChannelHandlerContext;

/**
<code>Handle.java</code>
<p>
	TODO: 消息处理器
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月12日 上午11:16:24
	@version 1.0 
	@lastUpdate 无
</p>
*/
public interface Handle {
	
	//处理请求
	void sendHandle(ChannelHandlerContext ctx);
	
	void receiveHandle(ChannelHandlerContext ctx, MessageProto.Message evt);
	
}

