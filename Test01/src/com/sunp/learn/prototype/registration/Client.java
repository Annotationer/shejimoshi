package com.sunp.learn.prototype.registration;

public class Client {

	public static void main(String [] args) {
		try {
			Prototype p1 = new ConcretePrototype1();
			PrototypeManager.setPrototype("P1", p1);
			Prototype p3 = PrototypeManager.getPrototype("P1").clone();
			p3.setName("张三");
			System.out.println("第一个实例：" + p3);
			Prototype p2 = new ConcretePrototype2();
			PrototypeManager.setPrototype("P2", p2);
			Prototype p4 = PrototypeManager.getPrototype("P2").clone();
			p4.setName("李四");
			System.out.println("第二个实例："+ p4);
			PrototypeManager.removePrototype("P1");
			Prototype p5 = PrototypeManager.getPrototype("p1").clone();
			p5.setName("王无");
			System.out.println("第三个实例：" + p5);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
