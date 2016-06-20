package com.designpattern.creational.abstractfactory;

public class ShapeFactory implements AbstractFactory{

	@Override
	public ShapeInterface getShape(String shapeString)
	{
		ShapeInterface shape = null;
		
		if("RECTANGLE".equalsIgnoreCase(shapeString))
		{
			shape = new RectangleShape();
			return shape;
		}
		return null;
	}

	@Override
	public ColorInterface getColor(String colorString) 
	{
		return null;
	}
}
