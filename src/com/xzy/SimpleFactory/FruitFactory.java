package com.xzy.SimpleFactory;

public class FruitFactory {

	public static Fruit get(String type) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		
		Class fruit = Class.forName(type);
		return (Fruit) (fruit.newInstance());
		
	}
	
}
