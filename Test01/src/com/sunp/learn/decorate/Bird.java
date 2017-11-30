package com.sunp.learn.decorate;

public class Bird extends Change {

	public Bird (TheGreatestSage sage){
		super(sage);
	}
	public void move(){
		System.out.println("Bird Move");
	}
}
