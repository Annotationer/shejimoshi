package com.sunp.learn.composite.lucency;

public class Leaf extends Component {
	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	public void printStruct(String preStr) {
		System.out.println(preStr + "-" + name);
	}

}
