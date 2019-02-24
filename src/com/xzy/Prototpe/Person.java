package com.xzy.Prototpe;

public class Person implements Cloneable {
	private String name;
	private int age;
	private char sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person() {
		super();
	}
	public Person(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	//Ç³¶È¿ËÂ¡
	public Person clone() {
		try {
			return (Person)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}










