package com.sunp.learn.Builder;

public class ConcreteBuilder implements Builder {

	private Product product = new Product();

	@Override
	public void budilPart1() {
		// TODO Auto-generated method stub
		product.setPart1("���1");
	}

	@Override
	public void budilPart2() {
		// TODO Auto-generated method stub
		product.setPart2("���2");
	}

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
	
}
