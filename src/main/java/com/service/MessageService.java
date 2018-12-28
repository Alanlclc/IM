
package com.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.netty.channel.Channel;

/**
<code>ExecutorConfig.java</code>
<p>
	TODO: something to do by the file
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月28日 下午5:27:29
	@version 1.0 
	@lastUpdate 无
</p>
*/

public interface MessageService {

	//初始化一个存储连接通道的线程安全的map
	public static Map<Integer, Channel> map = new ConcurrentHashMap<>();
	
	public void putChannel(Integer userId,Channel channel);
	
	public void removeChannle(Integer userId,Channel channel);
	
	public void sendOneToOneMsg();
	
	public void sendOneToManyMsg();
	
	public Channel getChannelByUserId(Integer userId);
	
	public List<Channel> getChannelListByIdList(List<Integer> list);
	
}

