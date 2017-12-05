package com.sunp.learn.flyweight.concrete;

import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyweight implements Flyweight {

	private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
	
	
	
	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		Flyweight fly = null;
		for(Object obj : files.keySet()) {
			fly = files.get(obj);
			fly.operation(state);
		}
	}
	
	public void add(Character key, Flyweight fly) {
		files.put(key,fly);
	}

	
	
}
