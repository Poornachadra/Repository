package com.designpattern.creational.factory;

public class ShapeFactory {

	public static ShapeInterface getShape(ShapeEnumeration shape)
	{
		ShapeInterface shapeObject = null;
		switch(shape)
		{
			case CIRCLE : 
				shapeObject = new ShapeCircle();
				return shapeObject;
			case TRIANGLE : 
				shapeObject = new ShapeTriangle();
				return shapeObject;
			case RECTANGLE : 
				shapeObject = new ShapeRectangle();
				return shapeObject;
			default :
				shapeObject = new ShapeCircle();
				return shapeObject;
		}
	}
}
