package com.xzy.Factory;

public class Test {

	public static void main(String[] args) {
		Factory t1 = new AppleFactory();
		Fruit apple = t1.get();
		apple.get();
		
		Factory t2 = new BananaFactory();
		Fruit banana = t2.get();
		banana.get();
	}
}
