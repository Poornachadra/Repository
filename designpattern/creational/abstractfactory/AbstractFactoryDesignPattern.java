package com.designpattern.creational.abstractfactory;

public class AbstractFactoryDesignPattern 
{

	public static void main(String[] args) 
	{
		AbstractFactory shapeFactory = ShapeColorFactoryCreator.getFactory("SHAPE");
		ShapeInterface rectangleShape = shapeFactory.getShape("RECTANGLE");
		rectangleShape.draw();
		
		AbstractFactory colorFactory = ShapeColorFactoryCreator.getFactory("COLOR");
		ColorInterface redColor = colorFactory.getColor("RED");
		redColor.fill();
	}

}
