package com.tnsif.abstactclassdemo;

public class AbstractDemo {

	public static void main(String[] args) {
		Shape s;
		
		s=new Sqauare();
		s.calArea();
		s.show();
		
		s=new Rectangle(2.0f,7.0f);
		s.calArea();
		s.show();
		

	}

}
