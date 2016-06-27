package com.designpattern.creational.prototype;

public abstract class AbstractShape implements Cloneable{

	private int  id;
	private String type ;
	
	public abstract void draw();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
}
