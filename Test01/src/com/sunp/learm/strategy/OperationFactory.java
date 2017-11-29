package com.sunp.learm.strategy;

public class OperationFactory {

	public static Operation createOperation(String operate) {
		Operation oper = null;
		switch(operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "*":
			oper = new OperationMul();
			break;
		}
		return oper;
	}
}