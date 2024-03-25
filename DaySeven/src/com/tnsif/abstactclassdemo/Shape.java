package com.tnsif.abstactclassdemo;

public abstract class Shape {
	
	protected float area;
	
	
	//abstract method
	public  abstract float calArea();
	
	
	//solid method
	public void show()
	{
		System.out.println("Area of the shape "+area);
	}
	
	

}
