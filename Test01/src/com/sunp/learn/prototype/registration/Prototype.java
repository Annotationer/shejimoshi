package com.sunp.learn.prototype.registration;

public interface Prototype {

	public Prototype clone();
	
	public String getName();
	
	public void setName(String name);
}
