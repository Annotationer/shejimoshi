package com.sunp.learn.prototype.registration;

public class ConcretePrototype2 implements Prototype{

	private String name;
	
	public  String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name  = name;
	}
	
	public String toString() {
		return "now in Prototype2, name" + this.name;
	}
	
	public Prototype clone() {
		ConcretePrototype2 prototype = new ConcretePrototype2();
		prototype.setName(this.name);
		return prototype;
	}
}
	