package com.sunp.learn.observer;

public class ConcreteObserver implements Observer {

	private String observerState;
	@Override
	public void update(String state) {
		// TODO Auto-generated method stub
		observerState = state;
		System.out.println("״̬Ϊ:"+observerState);
	}
}
