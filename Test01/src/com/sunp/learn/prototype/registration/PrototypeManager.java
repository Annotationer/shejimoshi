package com.sunp.learn.prototype.registration;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

	private static Map<String,Prototype> map = new HashMap<String,Prototype>();
	
	private PrototypeManager() {
		
	}
	
	public synchronized static void setPrototype(String prototypeId,Prototype prototype) {
		map.put(prototypeId,prototype);
	}
	
	public synchronized static void removePrototype(String prototypeId) {
		map.remove(prototypeId);
	}

	public synchronized static Prototype getPrototype(String prototypeId) throws Exception{
		Prototype prototype = map.get(prototypeId);
		if(prototype == null) {
			throw new Exception("您希望获取的原型还没有注册或者已被销毁");
		}
		return prototype;
	}


}


