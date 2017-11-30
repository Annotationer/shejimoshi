package com.sunp.learn.Builder.email;

public class Client {
	public static void main(String[] args) {
		Builder builder = new WelcomeBuilder();
		Director director = new Director(builder);
		director.construct("toAddress", "fromAddress");
	}
}
