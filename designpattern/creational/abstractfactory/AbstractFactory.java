package com.designpattern.creational.abstractfactory;

public interface AbstractFactory {

	public ShapeInterface getShape(String shape);
	public ColorInterface getColor(String color);
	
}
