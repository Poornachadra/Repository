package com.designpattern.creational.factory;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		ShapeInterface shape = ShapeFactory.getShape(ShapeEnumeration.CIRCLE);
		shape.draw();
		
		shape = ShapeFactory.getShape(ShapeEnumeration.TRIANGLE);
		shape.draw();
		
		shape = ShapeFactory.getShape(ShapeEnumeration.RECTANGLE);
		shape.draw();
		
	}
}
