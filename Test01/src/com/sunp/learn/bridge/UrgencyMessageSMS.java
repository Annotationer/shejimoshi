package com.sunp.learn.bridge;

public class UrgencyMessageSMS implements UrgencyMessage {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		message = "加急：" + message;
        System.out.println("使用系统内短消息的方法，发送消息'"+message+"'给"+toUser);
	}

	@Override
	public Object watch(String messageId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
