package com.xzy.single;
/*
 * 懒汉式
 */
public class Person3 {
	private static Person3 person;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Person3() {
		super();
		// TODO Auto-generated constructor stub
	}
	//提供一个全局的静态方法，使用同步方法
	public static synchronized Person3 getPerson() {
		if(person == null) {
			person = new Person3();
		}
		return person;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
