package com.sunp.learn.test;

public class test {

	public static void main(String[] args) throws CloneNotSupportedException {
		A a =new A();
		a.clone();
	}
}

class A  implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
