package com.xzy.AbstractFactory;

public class NorthFactory implements FruitFactory {

	@Override
	public Fruit getApple() {
		return new NorthApple();
	}

	@Override
	public Fruit getBanana() {
		return new NorthBanana();
	}
	

}
