package com.designpattern.creational.prototype;

public class PrototypeDesignPattern {

	public static void main(String[] args) {
		ShapePrototype.loadShapeMap();
		
		AbstractShape circleClone = ShapePrototype.getShape("Circle");
		circleClone.draw();
		
		AbstractShape rectangleClone = ShapePrototype.getShape("Rectangle");
		rectangleClone.draw();
	}

}
