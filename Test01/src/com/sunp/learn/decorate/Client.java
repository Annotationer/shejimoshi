package com.sunp.learn.decorate;

public class Client {
	public static void main(String[] args) {
		TheGreatestSage sage = new Monkey();
		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage fish = new Fish(sage);
		fish.move();
	}
}
