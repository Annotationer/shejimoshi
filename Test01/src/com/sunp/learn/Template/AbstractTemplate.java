package com.sunp.learn.Template;

public abstract class AbstractTemplate {
	public void templateMethod() {
		abstractMethod();
		hookMethod();
		concreteMethod();
	}
	
	protected abstract void abstractMethod();
	
	protected void hookMethod() {}
	
	private  final void concreteMethod() {
		
	}
	
}
