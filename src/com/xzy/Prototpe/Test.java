package com.xzy.Prototpe;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		Person person1 = new Person("����",18,'��');
//		Person person2 = person1.clone();
//		person1.setName("�°�");
//		System.out.println(person1);
//		System.out.println(person2);
		Person1 person1 = new Person1("����",18,'��');
		List<String> list = new ArrayList<String>();
		list.add("һ");
		list.add("��");
		person1.setFriends(list);
		Person1 person2 = person1.clone();
		list.add("��");
		System.out.println(person1);
		System.out.println(person2);
		
	}
}

