package com.sunp.learn.proxy;

public class ProxyObject extends AbstractObject {

	RealObject realObject = new RealObject();
	
	public void operation() {
		System.out.println("before");        
        realObject.operation();        
        //����Ŀ�����֮���������ز���
        System.out.println("after");
	}
}
