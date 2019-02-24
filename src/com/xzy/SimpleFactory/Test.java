package com.xzy.SimpleFactory;
//package com.xzy.SimpleFactory;


public class Test {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	
		Fruit apple = FruitFactory.get("com.xzy.SimpleFactory.Apple" );
		Fruit banana = FruitFactory.get("com.xzy.SimpleFactory.Banana");
		apple.get();
		banana.get();
	}
}
