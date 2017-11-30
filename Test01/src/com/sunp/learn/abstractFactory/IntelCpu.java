package com.sunp.learn.abstractFactory;

public class IntelCpu implements Cpu {
	private int pins = 0;
	
	

	public IntelCpu(int pins) {
		super();
		this.pins = pins;
	}



	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Intel cpu :" + this.pins);
	}

}
