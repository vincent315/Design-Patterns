package com.xzy.Factory;

public class BananaFactory implements Factory{
	
	public Fruit get() {
		return new Banana();
	}

}
