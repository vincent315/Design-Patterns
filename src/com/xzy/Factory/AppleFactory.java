package com.xzy.Factory;

public class AppleFactory implements Factory {

	public Fruit get() {
		return new Apple();
	}
}
