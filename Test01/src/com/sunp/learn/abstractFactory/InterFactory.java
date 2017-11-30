package com.sunp.learn.abstractFactory;

public class InterFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu(755);
	}

	@Override
	public Mainboard createMainboard() {
		// TODO Auto-generated method stub
		return new InterMainboard(755);
	}

	
}
