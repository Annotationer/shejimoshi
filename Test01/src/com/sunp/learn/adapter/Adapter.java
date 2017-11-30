package com.sunp.learn.adapter;

public class Adapter extends Adaptee implements Target {

	public void sampleOperation2(){
		System.out.println("2");
	}
	
	
	public Adapter(){
		super();
	}
}
