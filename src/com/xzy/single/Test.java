package com.xzy.single;

public class Test {
	public static void main(String[] args) {
		Person4 p1 = Person4.getPerson();
		p1.setName("����");
		Person4 p2 = Person4.getPerson();
		p2.setName("����");
		System.out.println(p1);
		System.out.println(p2);
	}
}
