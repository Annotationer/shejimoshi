package com.sunp.learn.Builder;

public class ConcreteBuilder implements Builder {

	private Product product = new Product();

	@Override
	public void budilPart1() {
		// TODO Auto-generated method stub
		product.setPart1("Áã¼þ1");
	}

	@Override
	public void budilPart2() {
		// TODO Auto-generated method stub
		product.setPart2("Áã¼þ2");
	}

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
	
}
