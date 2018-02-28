package main.java.com.sample;

public class Customer {
	private String name ;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int age;

	public Customer(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
