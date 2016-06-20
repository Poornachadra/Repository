package com.designpattern.creational.abstractfactory;

public class ColorFactory implements AbstractFactory{

	@Override
	public ColorInterface getColor(String colorString)
	{
		ColorInterface color = null;
		if("RED".equalsIgnoreCase(colorString))
		{
			color = new RedColor();
			return color;
		}
		return null;
	}
	
	@Override
	public ShapeInterface getShape(String shape) {
		return null;
	}
}
