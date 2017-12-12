package com.sunp.learn.bridge;

public class CommonMessageSMS implements Message {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		 System.out.println("使用系统内短消息的方法，发送消息'"+message+"'给"+toUser);
	}

}
