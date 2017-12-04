package com.sunp.learn.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.security.auth.Subject;

public class ProxyHandler implements InvocationHandler {

	Object obj = null;
	
	public Object newProxyInstance(Object realObj) {
		this.obj = realObj;
		Class<?> classType = this.obj.getClass();
		return Proxy.newProxyInstance(classType.getClassLoader(), classType.getInterfaces(), this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.print("I'm Proxy, I'm invoking...");
		Object object = method.invoke(obj, args);
		System.out.println(object);
		return object;
	}
}
