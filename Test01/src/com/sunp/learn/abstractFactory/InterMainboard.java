package com.sunp.learn.abstractFactory;

public class InterMainboard implements Mainboard {

	private int cpuHoles = 0;

	public InterMainboard(int cpuHoles) {
		super();
		this.cpuHoles = cpuHoles;
	}

	@Override
	public void installCPU() {
		// TODO Auto-generated method stub
		 System.out.println("Intel主板的CPU插槽孔数是：" + cpuHoles);
	}
	
}
