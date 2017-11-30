package com.sunp.learn.abstractFactory;

public class AmdCpu implements Cpu {

	private int pins = 0;

	public AmdCpu(int pins) {
		super();
		this.pins = pins;
	}
	
	public void calculate(){
		 System.out.println("AMD CPUµÄÕë½ÅÊı£º" + pins);
	}
}
