# IM
IM Server by Netty 4.0
#### 消息体采用protobuf


	syntax = "proto3";
	option java_package="com.pojo";
	option java_outer_classname="MessageProto";
	
	message Message
	{
		enum Type //枚举请求消息类型
		{ 
			HEARTBEAT = 0; 
	        MESSAGE = 1;
	        IMAGE = 2;
	        VIDEO = 3;
		}
		enum Target //枚举消息接收者目标类型
		{ 
			USER = 0; 
	        GROUP = 1;
		}
		Type type = 1;
		Target target = 2;
	    int32 id = 3;
	    int32 targetId = 4;
	    string mes = 5;
	    string sendTime = 6;
	}




