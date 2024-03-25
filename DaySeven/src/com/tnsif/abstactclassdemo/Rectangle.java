package com.tnsif.abstactclassdemo;

public class Rectangle extends Shape {

	
	private float length,breadth;
	
	
	public Rectangle() {
		this.length=length;
		this.breadth=breadth;
	}


	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public float calArea() {
		area=length*breadth;
		return area;
	}

}
