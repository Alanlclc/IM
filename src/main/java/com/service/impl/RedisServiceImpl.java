
package com.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.config.RedisKey;
import com.pojo.MessageProto.Message;
import com.service.MessageService;
import com.service.RedisService;
import com.utils.Auth;

/**
<code>RedisServiceImpl.java</code>
<p>
	TODO: redis服务
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月12日 下午6:23:54
	@version 1.0 
	@lastUpdate 无
</p>
*/

@Service
@SuppressWarnings("unchecked")
public class RedisServiceImpl implements RedisService{
	
	@Autowired
	private ValueOperations<String, Object> valueOperations;
	
	@Autowired
	private ListOperations<String, Object> listOperations;
	
	
	
	@Override
	public Integer checkLogin(String username,String password) {
		return Auth.loginAuth(username, password);
	}

	@Override
	public void cancelOnline(Integer userId) {
		List<Integer> onlineList = (List<Integer>) valueOperations.get(RedisKey.LOGIN.VALUE);
		if(onlineList != null && onlineList.contains(userId)) {
			onlineList.remove(userId);
			valueOperations.set(RedisKey.LOGIN.VALUE, onlineList);
		}
		return;
	}

	@Override
	public void pushOneToOneMeg(Integer userId, Integer targetId, Message oneToOneMsg) {
		//判断对方是否在线
		//在线  直接推给对方    
		//不在线   在redis存起来
		if(checkOnline(targetId)) {
			
		}else {
			listOperations.leftPush(RedisKey.SESSION.VALUE, oneToOneMsg);
		}
	}

	@Override
	public void online(Integer userId) {
		List<Integer> onlineList = (List<Integer>) valueOperations.get(RedisKey.LOGIN.VALUE);
		if(onlineList != null) {
			onlineList.add(userId);
		}else {
			onlineList = new ArrayList<>();
			onlineList.add(userId);
		}
		valueOperations.set(RedisKey.LOGIN.VALUE, onlineList);
	}

	@Override
	public boolean checkOnline(Integer userId) {
		List<Integer> onlineList = (List<Integer>) valueOperations.get(RedisKey.LOGIN.VALUE);
		if(onlineList != null && onlineList.contains(userId)) {
			return true;
		}
		return false;
	}

	@Override
	public List<Message> getAllMessage(Integer userId) {
		List<Object> list = listOperations.range(RedisKey.SESSION.VALUE, 0, -1);
		List<Message> collect = list.stream()
									.filter(e->e instanceof Message)
									.map(e->(Message)e)
									.collect(Collectors.toList());
		return collect;
	}




}

