package com.sunp.learn.proxy.dynamic;


public class Client {

	public static void main(String[] args) {
		  System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		//Subject object = new RealSubject1();
		Subject subject = (Subject) new ProxyHandler().newProxyInstance(new RealSubject1());
        Subject subject2 = (Subject) new ProxyHandler().newProxyInstance(new RealSubject2());
      
        subject.operate2();
        subject2.operate4();
        subject.operate6("sdsd");
    }
}
