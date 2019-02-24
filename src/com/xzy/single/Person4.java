package com.xzy.single;
/*
 * 双重检查，也是懒汉式，是懒汉式的一个改进
 */
public class Person4 {
	private static Person4 person;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Person4() {
		super();
		// TODO Auto-generated constructor stub
	}
	//提供一个全局的静态方法
	public static synchronized Person4 getPerson() {
		if(person == null) {
			synchronized (Person4.class) {
				if(person == null) {
					person = new Person4();
				}
			}
		}
		return person;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
