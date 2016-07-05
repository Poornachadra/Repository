package com.designpattern.creational.builder;

public class MealBuilder {

	public void buildVegMeal() {
		Meal vegMeal = new Meal();
		vegMeal.addItem(new VegBurger());
	}
}
