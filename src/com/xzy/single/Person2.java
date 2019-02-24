package com.xzy.single;
/*
 * ¿¡∫∫ Ω
 */
public class Person2 {
	private static Person2 person;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Person2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Person2 getPerson() {
		if(person == null) {
			person = new Person2();
		}
		return person;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
