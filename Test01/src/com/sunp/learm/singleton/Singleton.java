package com.sunp.learm.singleton;

public class Singleton {
	private volatile static Singleton instance = null;
//	private  static double i ;
//	public Singleton() {
//		i = Math.random();
//	}
//	
//	
//	public double getI() {
//		return i;
//	}
//
//
//	public void setI(double i) {
//		this.i = i;
//	}


	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
