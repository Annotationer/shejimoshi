package com.sunp.learn.flyweight.bridge;

public abstract class Abstraction {
	protected Implementor impl;
	
	public Abstraction(Implementor impl) {
		this.impl = impl;
	}
	
	public void operation() {
		impl.operationImpl();
	}
}
