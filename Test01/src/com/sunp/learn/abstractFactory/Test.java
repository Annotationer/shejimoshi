package com.sunp.learn.abstractFactory;

public class Test {

	public static void main(String[] args) {
		ComputerEngineer ce = new ComputerEngineer();
		ce.makeComputer(new InterFactory());
		
	}
}
