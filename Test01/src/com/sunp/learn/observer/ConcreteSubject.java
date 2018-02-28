package com.sunp.learn.observer;

public class ConcreteSubject extends Subject {

	private String state;
	public String getState() {
		return state;
	}
	public void change(String newState) {
		state = newState;
		System.out.println("����״̬Ϊ��"+state);
		this.nodifyObservers(state);
	}
}