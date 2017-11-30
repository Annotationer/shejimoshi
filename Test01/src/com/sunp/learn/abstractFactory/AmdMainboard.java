package com.sunp.learn.abstractFactory;

public class AmdMainboard implements Mainboard {

	private int amdHoles = 0;

	public AmdMainboard(int amdHoles) {
		super();
		this.amdHoles = amdHoles;
	}

	@Override
	public void installCPU() {
		// TODO Auto-generated method stub
		System.out.println("AMD主板的CPU插槽孔数是：" + amdHoles);
	}
	
}
