package com.sunp.learn.bridge;

public class CommonMessageSMS implements Message {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		 System.out.println("ʹ��ϵͳ�ڶ���Ϣ�ķ�����������Ϣ'"+message+"'��"+toUser);
	}

}
