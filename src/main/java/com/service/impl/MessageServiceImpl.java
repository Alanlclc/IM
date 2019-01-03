
package com.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pojo.MessageProto.Message;
import com.service.MessageService;
import com.service.RedisService;

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
	
	private static Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);
	
	@Autowired
	private RedisService redisService;
	
	@Override
	public void putChannel(Integer userId,Channel channel) {
		map.put(userId, channel);
	};
	
	@Override
	public void removeChannle(Integer userId,Channel channel) {
		map.remove(userId, channel);
	}

	@Override
	public void pushOneToOneMeg(Message message) {
		Integer targetId = message.getTargetId();
		if(checkOnline(targetId)) {
			Channel channel = map.get(targetId);
			channel.alloc();
			channel.writeAndFlush(message);
		}else {
			logger.info("处理离线消息");
			redisService.addOutlineMes(message);
		}
	}

	@Override
	public void pushOneToManyMsg(Message message) {
//		Integer groupId = message.getTargetId();
//		List<Integer> groups = redisService.getGroupMemberId(groupId);
//		for (Integer targetId : groups) {
//			if(checkOnline(targetId)) {
//				Channel channel = map.get(targetId);
//				channel.alloc();
//				channel.writeAndFlush(message);
//			}else {
//				
//			}
//		}
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
	}

	@Override
	public boolean checkOnline(Integer userId) {
		Set<Integer> keySet = map.keySet();
		if(keySet.size()>0 && keySet.contains(userId)) {
			return true;
		}
		return false;
	}

	@Override
	public void pushMessageOutLine(Integer userId) {
		
		
		
		
		
	};
	
}

