package com.designpattern.creational.builder;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		mealBuilder.buildVegMeal();
		System.out.println("Done");
	}

}
