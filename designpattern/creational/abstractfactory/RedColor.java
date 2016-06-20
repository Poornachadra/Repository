package com.designpattern.creational.abstractfactory;

public class RedColor implements ColorInterface {

	@Override
	public void fill() {
		System.out.println("Filling color Red");
	}

}
