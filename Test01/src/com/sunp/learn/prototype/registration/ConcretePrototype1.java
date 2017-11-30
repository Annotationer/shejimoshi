package com.sunp.learn.prototype.registration;

public class ConcretePrototype1 implements Prototype{
	private String name;
	
	public Prototype clone() {
		ConcretePrototype1 prototype = new ConcretePrototype1();
		prototype.setName(this.name);
		return prototype;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public String toString() {
		return "now in Prototype1, name" + this.name;
	}

}
