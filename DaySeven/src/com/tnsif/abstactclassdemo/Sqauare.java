package com.tnsif.abstactclassdemo;

public class Sqauare extends Shape {
	
	private float side;
	
	

	public Sqauare() {
		side=2.0f;
	}

	
	public Sqauare(float side) {
		super();
		this.side = side;
	}


	@Override
	public float calArea() {
		area=side*side;
		return area;
	}
	
	
}
