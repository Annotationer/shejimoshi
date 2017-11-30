package com.sunp.learn.Builder.email;

public class Director {
	Builder builder;
	
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void construct(String toAddress,String fromAddress){
		this.builder.builTo(toAddress);
		this.builder.buildFrom(fromAddress);
		this.builder.buildSubject();
		this.builder.buildBody();
		this.builder.buildSendDate();
		
	}
	
	
}
