package com.sunp.learn.composite.lucency;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> childComponents = new ArrayList<Component>();
	
	private String name;
	
	public Composite(String name) {
		this.name = name;
	}
	
	public void addChild(Component child) {
		childComponents.add(child);
	}
	
	
	public void removeChild(int index) {
		// TODO Auto-generated method stub
		childComponents.remove(index);
	}
	
	@Override
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr + " + " + this.name);
		if(this.childComponents != null) {
			preStr += " ";
			for(Component c : childComponents) {
				c.printStruct(preStr);
			}
		}
	}
	

}
