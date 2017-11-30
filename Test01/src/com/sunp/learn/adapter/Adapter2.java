package com.sunp.learn.adapter;

public class Adapter2 {

	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	
	public void sampleOpearation1(){
		this.adaptee.sampleOperation1();
	}
	
	public void sampleOpearation2(){
		
	}
}
