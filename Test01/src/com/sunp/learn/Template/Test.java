package com.sunp.learn.Template;

public class Test {
	public static void main(String[] args) {
		AbstractTemplate a = null ;
		System.out.println(a.getClass());
		a = new ConcreteTemplate();
		System.out.println(a.getClass());
		a = new c();
		System.out.println(a.getClass());
	}
}
