package com.designpattern.creational.abstractfactory;

public class RectangleShape implements ShapeInterface {

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

}
