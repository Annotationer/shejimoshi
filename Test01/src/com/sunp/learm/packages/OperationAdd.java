package com.sunp.learm.packages;

public class OperationAdd extends Operation{
	public double GetResult() {
		double result = 0;
		result = this.getNumberA() + this.getNumberB();
		return result;
	}
}
