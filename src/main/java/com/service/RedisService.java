
package com.service;

import com.pojo.MessageProto.Message;

/**
<code>RedisService.java</code>
<p>
	TODO: something to do by the file
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月11日 下午4:56:17
	@version 1.0 
	@lastUpdate 无
</p>
*/
public interface RedisService {

	boolean checkLogin(Integer userId);
	
	void removeLogin(Integer userId);

	void pushOneToOneMeg(Integer userId, Integer targetId, Message oneToOneMsg);
}

