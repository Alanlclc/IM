
package com.service;

import java.util.List;

import com.pojo.MessageProto.Message;

/**
<code>RedisService.java</code>
<p>
	TODO: redis服务接口
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

	void addOutlineMes(Message message);
}

