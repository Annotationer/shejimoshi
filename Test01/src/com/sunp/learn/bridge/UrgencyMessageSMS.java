package com.sunp.learn.bridge;

public class UrgencyMessageSMS implements UrgencyMessage {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		message = "�Ӽ���" + message;
        System.out.println("ʹ��ϵͳ�ڶ���Ϣ�ķ�����������Ϣ'"+message+"'��"+toUser);
	}

	@Override
	public Object watch(String messageId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
