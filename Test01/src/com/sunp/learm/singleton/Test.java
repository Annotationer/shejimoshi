package com.sunp.learm.singleton;

public class Test {
	public static void main(String[] args) {
		Singleton s = new Singleton();
		Singleton s2 = new Singleton();
		//System.out.println("s.i:"+s.getI()+"   s2.i:"+s2.getI());
		LazySingleton lsl = new LazySingleton();
		LazySingleton lsl2 = new LazySingleton();
		System.out.println(lsl.equals(lsl2));
	
		clazz c = new clazz();
		clazz c2 = new clazz();
		System.out.println("c:"+c.getI()+"  c2:"+c2.getI());
		
	}
}

class clazz{
	private static double i ;

	public double getI() {
		return i;
	}

	public void setI(double i) {
		this.i = i;
	}
	
	public clazz() {
		i = Math.random();
	}
}
