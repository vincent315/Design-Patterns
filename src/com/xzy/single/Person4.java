package com.xzy.single;
/*
 * ˫�ؼ�飬Ҳ������ʽ��������ʽ��һ���Ľ�
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
	//�ṩһ��ȫ�ֵľ�̬����
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
