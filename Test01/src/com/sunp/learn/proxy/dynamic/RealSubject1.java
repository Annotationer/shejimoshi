package com.sunp.learn.proxy.dynamic;

public class RealSubject1 implements Subject {
	 @Override
	    public String operate1()
	    {
	        return "RealSubject-operate1()";
	    }

	    @Override
	    public String operate2()
	    {
	        return "RealSubject-operate2()";
	    }

	    @Override
	    public String operate3()
	    {
	        return "RealSubject-operate3()";
	    }

	    @Override
	    public String operate4()
	    {
	        return "RealSubject-operate4()";
	    }

	    @Override
	    public String operate5()
	    {
	        return "RealSubject-operate5()";
	    }
	    
	    public void operate6(String str) {
	    	System.out.println("RealSubject-operate6() :"+ str);
	    }
}
