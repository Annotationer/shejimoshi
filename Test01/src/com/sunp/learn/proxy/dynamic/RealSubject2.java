package com.sunp.learn.proxy.dynamic;

public class RealSubject2 implements Subject {
	 @Override
	    public String operate1()
	    {
	        return "RealSubject2-operate1()";
	    }

	    @Override
	    public String operate2()
	    {
	        return "RealSubject2-operate2()";
	    }

	    @Override
	    public String operate3()
	    {
	        return "RealSubject2-operate3()";
	    }

	    @Override
	    public String operate4()
	    {
	        return "RealSubject2-operate4()";
	    }

	    @Override
	    public String operate5()
	    {
	        return "RealSubject2-operate5()";
	    }

		@Override
		public void operate6(String str) {
			// TODO Auto-generated method stub
			
		}
}
