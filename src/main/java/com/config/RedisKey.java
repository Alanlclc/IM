
package com.config;
/**
<code>RedisKey.java</code>
<p>
	TODO: something to do by the file
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月11日 下午5:33:55
	@version 1.0 
	@lastUpdate 无
</p>
*/
public enum RedisKey {

	
	/**
	 * 离线消息
	 */
	OUTLINE_MESSAGE("I:O:");
	
	
	public final String VALUE;
	
	private RedisKey(String VALUE) {
		this.VALUE = VALUE;
    }
}



