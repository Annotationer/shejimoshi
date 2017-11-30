package com.sunp.learn.decorate.test2;

public class Test {
	public static void main(String[] args) {
		Monkey m = new Monkey();
		Monkey m2 = new Fish(m);
		m2.move();
		
		
	}
}
