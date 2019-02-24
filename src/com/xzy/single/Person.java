package com.xzy.single;
/*
 * ¶öººÊ½
 */
public class Person {
	public static final Person person = new Person();
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Person getPerson() {
		return person;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
