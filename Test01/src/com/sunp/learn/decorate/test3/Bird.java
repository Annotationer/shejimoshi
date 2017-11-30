package com.sunp.learn.decorate.test3;

public class Bird {

	private Change change;
	
	public Bird(Change change){
		this.change = change;
	}
	
	public void move(){
		System.out.println("bird move");
	}
}
