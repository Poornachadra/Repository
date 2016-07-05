package com.designpattern.creational.builder;

public class Wrapper implements Packing{

	@Override
	public void pack() {
		System.out.println("Paking : Wrapper");
	}
}
