
package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
<code>NettyConfig.java</code>
<p>
	TODO: something to do by the file
</p>
<p>
	@company Amigo
	@author LuChen
	@time 2018年12月11日 下午2:53:44
	@version 1.0 
	@lastUpdate 无
</p>
*/
@Component
public class NettyConfig {
	
	@Value("${netty.port}")
	private Integer port; //服务器端口

	@Value("${netty.max-thread}")
	private Integer maxThread; //服务器handle处理池的最大线程

	@Value("${netty.max-frame-length}")
	private Integer maxFrameLength; //数据包最大长度

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public Integer getMaxThread() {
		return maxThread;
	}

	public void setMaxThread(Integer maxThread) {
		this.maxThread = maxThread;
	}

	public Integer getMaxFrameLength() {
		return maxFrameLength;
	}

	public void setMaxFrameLength(Integer maxFrameLength) {
		this.maxFrameLength = maxFrameLength;
	}
	
}

