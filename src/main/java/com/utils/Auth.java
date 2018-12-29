
package com.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.pojo.User;

/**
<code>Auth.java</code>
<p>
	TODO: 简单的登陆校验工具
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月11日 下午5:39:34
	@version 1.0 
	@lastUpdate 无
</p>
*/
public class Auth {

	private static Map<String,User> map = new ConcurrentHashMap<>();
	
	static {
		map.put("test1", new User(1, "test1", "123456"));
		map.put("test2", new User(2, "test2", "123456"));
		map.put("test3", new User(3, "test3", "123456"));
		map.put("test4", new User(4, "test4", "123456"));
		map.put("test5", new User(5, "test5", "123456"));
		map.put("test6", new User(6, "test6", "123456"));
	}
	
	public static Integer loginAuth(String username,String password) {
		if(map.get(username) !=null && map.get(username).getPassword().equals(password)) {
			return map.get(username).getId();
		}
		return 0;
	}	
	
	
}

