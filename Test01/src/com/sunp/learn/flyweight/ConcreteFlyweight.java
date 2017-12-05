package com.sunp.learn.flyweight;

public class ConcreteFlyweight implements Flyweight {

	private Character intrinsicState = null;

	public ConcreteFlyweight(Character intrinsicState) {
		super();
		this.intrinsicState = intrinsicState;
	}

	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		 System.out.println("Intrinsic State = " + this.intrinsicState);
		 System.out.println("Extrinsic State = " + state);
	}
	
	
}
