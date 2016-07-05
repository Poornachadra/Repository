package com.designpattern.creational.builder;

public abstract class AbstractBurger implements Item{

	@Override
	public Packing packing() {
		return new Wrapper();
	}
}
