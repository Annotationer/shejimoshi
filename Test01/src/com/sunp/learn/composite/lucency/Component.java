package com.sunp.learn.composite.lucency;

import java.util.List;

public abstract class Component {

	public abstract void printStruct(String preStr);
	
	public void addChild(Component child) {
		throw new UnsupportedOperationException("����֧��");
	}
	
	public void removeChild(int index) {
		throw new UnsupportedOperationException("����֧��");
	}
	
	public List<Component>getChild(){
		throw new UnsupportedOperationException("����֧��");
	}
}
