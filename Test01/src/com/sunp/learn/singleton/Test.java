package com.sunp.learn.singleton;

public class Test {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s.equals(s2));
		LazySingleton lsl = LazySingleton.getInstance();
		LazySingleton lsl2 = LazySingleton.getInstance();
		System.out.println(lsl.equals(lsl2));
		SingletonOfEnum  sl3  = SingletonOfEnum.uniqueInstace;
	}
}

