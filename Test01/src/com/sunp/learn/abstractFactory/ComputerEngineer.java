package com.sunp.learn.abstractFactory;

public class ComputerEngineer {

	private Cpu cpu = null;
	private Mainboard mainboard = null;
	
	private void  init(AbstractFactory factory){
		this.cpu = factory.createCpu();
		this.mainboard = factory.createMainboard();
		this.cpu.calculate();
		this.mainboard.installCPU();
	}
	
	public void makeComputer(AbstractFactory factory){
		this.init(factory);
	}
}
