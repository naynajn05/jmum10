package com.tnsif.methodoverriddingdemo;

public class Square extends Shape{
	
	
	
	private int side;
	
	
	
	public Square(int side) {
		super();
		this.side = side;
	}

	public void draw() {
		System.out.println("Drawing a sqaure with side " + side);

	}

	public void erase() {
		System.out.println("Erasing a sqaure");

	}

}
