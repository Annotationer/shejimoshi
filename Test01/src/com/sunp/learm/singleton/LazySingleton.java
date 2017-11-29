package com.sunp.learm.singleton;

public class LazySingleton {
	private static LazySingleton instance = null;
	public LazySingleton() {
		
	}
	
	public static synchronized LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		
		return instance;
		
	}
}