package com.designpattern.creational.singleton;

public class SingletonDesignPattern {

	public static void main(String[] args) {
		SingletonClass singleton = SingletonClass.getInstance();
		singleton.showMessage();
		
		SingletonClass singletonSecond = SingletonClass.getInstance();
		singletonSecond.showMessage();
	}

}
