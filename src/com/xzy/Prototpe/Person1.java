package com.xzy.Prototpe;

import java.util.ArrayList;
import java.util.List;

public class Person1 implements Cloneable {
	private String name;
	private int age;
	private char sex;
	private List<String> friends;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person1() {
		super();
	}
	public Person1(String name, int age, char sex) {
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
	//Éî¶È¿ËÂ¡
	public Person1 clone() {
		try {
			Person1 person = (Person1)super.clone();
			List<String> newFriends = new ArrayList();
			for(String friend : friends) {
				newFriends.add(friend);
			}
			person.setFriends(newFriends);
			return person;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", sex=" + sex + ", friends=" + friends + "]";
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
}










