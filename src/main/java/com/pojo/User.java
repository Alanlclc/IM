
package com.pojo;
/**
<code>User.java</code>
<p>
	TODO: 用户实体
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月12日 下午4:30:29
	@version 1.0 
	@lastUpdate 无
</p>
*/
public class User {

	private Integer id;
	
	private String username;
	
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
}

