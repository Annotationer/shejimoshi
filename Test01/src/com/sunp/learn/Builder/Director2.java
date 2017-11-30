package com.sunp.learn.Builder;

public class Director2 {

	private Builder builder;
	
	public Director2(Builder builer){
		this.builder = builer;
		builder.budilPart1();
		builder.budilPart2();
	}
	
//	public void construct(){
//		builder.budilPart1();
//		builder.budilPart2();
//	}
}
