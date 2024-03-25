package com.tnsif.methodoverriddingdemo;

public class Traingle extends Shape{
	
private int base,height;


	
	public Traingle(int base, int height) {
	super();
	this.base = base;
	this.height = height;
}

	public void draw() {
		System.out.println("Drawing a sqaure with base and height " + base +""+height);

	}

	public void erase() {
		System.out.println("Erasing a Traingle");

	}

}
