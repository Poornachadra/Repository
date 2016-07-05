package com.designpattern.creational.builder;

public class VegBurger extends AbstractBurger{

	@Override
	public String name() {
		return "Veg Burger";
	}
	
	@Override
	public int price() {
		return 20;
	}
}
