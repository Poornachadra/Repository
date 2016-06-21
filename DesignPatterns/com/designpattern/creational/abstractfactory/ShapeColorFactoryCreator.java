package com.designpattern.creational.abstractfactory;

public class ShapeColorFactoryCreator {

	public static AbstractFactory getFactory(String choice)
	{
		if("SHAPE".equalsIgnoreCase(choice))
		{
			return new ShapeFactory();
		}
		else
		{
			return new ColorFactory();
		}
	}
}
