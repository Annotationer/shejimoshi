package com.sunp.learn.flyweight;

import javax.xml.parsers.FactoryConfigurationError;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory factory  = new FlyweightFactory();
		Flyweight fly = factory.factory(new Character('a'));
		fly.operation("First Call");
		
		fly =factory.factory(new Character('b'));
		fly.operation("Second call");
		
		fly = factory.factory(new Character('a'));
		fly.operation("Third call");
	}
}
