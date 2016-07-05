package com.designpattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> mealList = new ArrayList<Item>();
	
	public void addItem(Item item) {
		mealList.add(item);
	}
	
}
