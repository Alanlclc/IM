
package com.utils;


import com.pojo.MessageProto;

/**
<code>MessageUtil.java</code>
<p>
	TODO: 消息生成工具
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月10日 下午6:43:42
	@version 1.0 
	@lastUpdate 无
</p>
*/ 
public class MessageUtil {
	
	public static MessageProto.Message getHeartBeatMsg(Integer id,Integer targetId) {
		MessageProto.Message.Builder builder = MessageProto.Message.newBuilder();
		builder.setTypeValue(0);
		builder.setTargetId(0);
		builder.setId(id);
		builder.setTargetId(targetId);
		builder.setSendTime(String.valueOf(System.currentTimeMillis()/1000));
		MessageProto.Message message = builder.build();
		return message;
	}
	
}

