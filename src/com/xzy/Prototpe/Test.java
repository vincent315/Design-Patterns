package com.xzy.Prototpe;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		Person person1 = new Person("µ°µ°",18,'ÄÐ');
//		Person person2 = person1.clone();
//		person1.setName("°Â°Â");
//		System.out.println(person1);
//		System.out.println(person2);
		Person1 person1 = new Person1("µ°µ°",18,'ÄÐ');
		List<String> list = new ArrayList<String>();
		list.add("Ò»");
		list.add("¶þ");
		person1.setFriends(list);
		Person1 person2 = person1.clone();
		list.add("Èý");
		System.out.println(person1);
		System.out.println(person2);
		
	}
}

