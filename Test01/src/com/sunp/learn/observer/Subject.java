package com.sunp.learn.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> list  = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		list.add(observer);
		System.out.println("Attached an observer");
	}
	
	public void detach(Observer observer) {
		list.remove(observer);
	}
	
	public void nodifyObservers(String newState) {
		for(Observer observer:list) {
			observer.update(newState);
		}
	}
	
	
}
