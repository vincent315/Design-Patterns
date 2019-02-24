package com.xzy.AbstractFactory;

public class Test {
	public static void main(String[] args) {
		FruitFactory f1 = new NorthFactory();
		Fruit apple1 = f1.getApple();
		apple1.get();
		Fruit banana1 = f1.getBanana();
		banana1.get();
		
		FruitFactory f2 = new SouthFactory();
		Fruit apple2 = f2.getApple();
		apple2.get();
		Fruit banana2 = f2.getBanana();
		banana2.get();
	}
}
