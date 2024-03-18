package com.tns.staticdemo;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass obj1=new MyClass();
		obj1.show();
		MyClass.addStudent(); //static method
		
		MyClass obj2=new MyClass();
		obj2.show();
		MyClass.addStudent(); //static method

	}

}
