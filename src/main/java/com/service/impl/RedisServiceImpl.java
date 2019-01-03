
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
public class RedisServiceImpl implements RedisService{
	
	@Autowired
	private ValueOperations<String, Object> valueOperations;
	
	@Autowired
	private ListOperations<String, Object> listOperations;

	@Override
	public void addOutlineMes(Message message) {
		listOperations.leftPush(RedisKey.OUTLINE_MESSAGE.VALUE + message.getTargetId(), message.getMes());
	}

}

