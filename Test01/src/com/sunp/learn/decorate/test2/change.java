package com.sunp.learn.decorate.test2;

public class change extends Monkey {
	private Monkey monkey;
	
	
	public change(Monkey monkey) {
		this.monkey = monkey;
	}


	public void move(){
		monkey.move();
	}
}
