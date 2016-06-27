package com.designpattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapePrototype {

	private static Map<String, AbstractShape> shapeMap = new HashMap<String, AbstractShape>();
	
	public static AbstractShape getShape(String value) {
		AbstractShape shape = shapeMap.get(value);
		return (AbstractShape) shape.clone();
	}
	
	public static void loadShapeMap() {
		CircleShape circle = new CircleShape();
		shapeMap.put("Circle", circle);
		
		RectangleShape rectangle = new RectangleShape();
		shapeMap.put("Rectangle", rectangle);
	}
}
