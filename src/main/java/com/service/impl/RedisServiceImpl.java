
package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.pojo.MessageProto.Message;
import com.service.RedisService;
import com.utils.Auth;

/**
<code>RedisServiceImpl.java</code>
<p>
	TODO: something to do by the file
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
public class RedisServiceImpl implements RedisService{
	
	
	@Autowired
	private ValueOperations<String, Object> valueOperations;
	
	@Autowired
	private ListOperations<String, Object> listOperations;
	
	
	@Override
	public boolean checkLogin(String username,String password) {
		return Auth.loginAuth(username, password);
	}

	@Override
	public void cancelOnline(Integer userId) {
		
	}

	@Override
	public void pushOneToOneMeg(Integer userId, Integer targetId, Message oneToOneMsg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void online(Integer userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkOnline(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

}

