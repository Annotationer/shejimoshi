package com.sunp.learn.Builder;

public class Client {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product product = builder.retrieveResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
		
		
		Builder builder2 = new ConcreteBuilder();
		Director2 director2 = new Director2(builder2);
//		builder2.budilPart1();
//		builder2.budilPart2();
		Product product2 = builder2.retrieveResult();
		System.out.println(product2.getPart1());
		System.out.println(product2.getPart2());
		
		
	}
}
