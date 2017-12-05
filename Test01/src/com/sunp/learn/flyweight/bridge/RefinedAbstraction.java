package com.sunp.learn.flyweight.bridge;

public class RefinedAbstraction extends Abstraction {
	public RefinedAbstraction(Implementor impl) {
		super(impl);
	}
	
	public void otherOperation() {
		System.out.println("RefinedAbstraction");
		this.impl.operationImpl();
	}

	public static void main(String[] args) {
		RefinedAbstraction ra = new RefinedAbstraction(new ConcreteImplementorA());
		ra.otherOperation();
	}
}
