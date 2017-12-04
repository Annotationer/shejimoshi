package com.sunp.learn.Builder.contract;

public class Client {
	public static void main(String[] args) {
		InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("6524", 123L, 456L);
		InsuranceContract contract = builder.setPersonName("ming").setOtherData("test").build();
		contract.someOperation();
	}
}
