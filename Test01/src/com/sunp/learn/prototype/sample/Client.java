package com.sunp.learn.prototype.sample;

public class Client {
	private Prototype prototype ;
	
	public Client(Prototype prototype) {
		this.prototype = prototype;
	}
	
//	public void operation(Prototype example) {
//		Prototype copyPrototype = (Prototype) example.clone();
//	}
//	
	public Prototype operation() {
		Prototype copyPrototype =  (Prototype) this.prototype.clone();
		return copyPrototype;
	}
	public static void main(String[] args) {
		ConcretePrototype1 p1 = new ConcretePrototype1();
		Prototype p = new Client(p1).operation();
		System.out.println(p1.equals(p));
		ConcretePrototype1 cp1 = p1;
		System.out.println(p1.equals(cp1));
	}
}
