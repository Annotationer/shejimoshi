package com.sunp.learn.singleton;

/*
 * 绫荤骇鍐呴儴绫�
 *
 */
public class Singleton2 {

	private Singleton2() {
		
	}
	
	private static class SingletonHolder{
		
		private static Singleton2 instance = new Singleton2();
		
	}
	
	public static Singleton2 getInstance() {
		return SingletonHolder.instance;
	}
	
}