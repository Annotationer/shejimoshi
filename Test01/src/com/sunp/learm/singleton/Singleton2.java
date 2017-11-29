package com.sunp.learm.singleton;

/*
 * 类级内部类
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
