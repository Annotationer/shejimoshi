package com.sunp.learn.decorate;

public class Change implements TheGreatestSage{

	private TheGreatestSage theGreatestSage;

	public Change(TheGreatestSage theGreatestSage) {
		//super();
		this.theGreatestSage = theGreatestSage;
	}
	
	@Override
	public void move(){
		theGreatestSage.move();
	}
	
}
