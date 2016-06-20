package com.designpattern.creational.singleton;

public class SingletonClass {

	private static SingletonClass instance = null;
	
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getInstance()
	{
		synchronized(SingletonClass.class){
			if(instance == null)
			{
				synchronized(SingletonClass.class){
					instance = new SingletonClass();
					return instance;
				}
			}
			else{
				return instance;
			}
		}
	}
	
	public void showMessage()
	{
		System.out.println(instance.toString());
	}
}
