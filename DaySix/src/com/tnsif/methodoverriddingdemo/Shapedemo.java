package com.tnsif.methodoverriddingdemo;

public class Shapedemo {
	
	public static void main(String[] args) {
		Shape[] shapes=new Shape[3];
		
		//instatiate classes
		shapes[0]=new Circle(2);
		shapes[1]=new Square(5);
		shapes[2]=new Traingle(3,4);
		
		
		
		for(Shape s:shapes)
		{
			s.draw();
			s.erase();
		}
	}

}
