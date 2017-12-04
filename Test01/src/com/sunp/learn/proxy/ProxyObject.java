package com.sunp.learn.proxy;

public class ProxyObject extends AbstractObject {

	RealObject realObject = new RealObject();
	
	public void operation() {
		System.out.println("before");        
        realObject.operation();        
        //调用目标对象之后可以做相关操作
        System.out.println("after");
	}
}
