package com.sunp.learn.Builder;

public class Director {

	private Builder builder;
	
	public Director(Builder builer){
		this.builder = builer;
	}
	
	public void construct(){
		builder.budilPart1();
		builder.budilPart2();
	}
}
