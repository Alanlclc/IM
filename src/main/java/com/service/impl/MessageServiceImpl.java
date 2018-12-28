
package com.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.service.MessageService;

import io.netty.channel.Channel;

/**
<code>MessageServiceImpl.java</code>
<p>
	TODO: 消息服务
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月28日 下午5:46:10
	@version 1.0 
	@lastUpdate 无
</p>
*/
@Service
public class MessageServiceImpl implements MessageService{
	
	@Override
	public void putChannel(Integer userId,Channel channel) {
		map.put(userId, channel);
	};
	
	@Override
	public void removeChannle(Integer userId,Channel channel) {
		map.remove(userId, channel);
	}

	@Override
	public void sendOneToOneMsg() {
		
		
	}

	@Override
	public void sendOneToManyMsg() {
		
		
	}

	@Override
	public Channel getChannelByUserId(Integer userId) {
		return map.get(userId);
	}

	@Override
	public List<Channel> getChannelListByIdList(List<Integer> list) {
		List<Channel> result = new ArrayList<>();
		if(list != null && list.size() > 0) {
			result = list.stream().map(e->map.get(e)).collect(Collectors.toList());
		}
		return result;
	};
	
	
	
	
}

