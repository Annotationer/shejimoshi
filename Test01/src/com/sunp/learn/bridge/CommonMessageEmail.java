package com.sunp.learn.bridge;

public class CommonMessageEmail implements Message {

	  @Override
	    public void send(String message, String toUser) {

	        System.out.println("ʹ���ʼ�����Ϣ�ķ�����������Ϣ'"+message+"'��"+toUser);
	    }
}
