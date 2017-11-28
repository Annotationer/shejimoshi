package com.sunp.learm.packages;

public class Test {
	public static void main(String args[]) {
		Operation oper ;
		oper = OperationFactory.createOperation("+");
		oper.setNumberA(1F);
		oper.setNumberB(2F);
		System.out.println(oper.GetResult());
		
	}
}
