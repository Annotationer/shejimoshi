package com.sunp.learn.decorate.test3;

public class Test {
	public static void main(String[] args) {
		Change m = new Monkey();
		Bird b = new Bird(m);
		b.move();
	}
}
