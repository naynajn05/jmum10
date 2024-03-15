package com.tns.packagethree;

public class MyClassDemo {

	public static void main(String[] args) {
		//MyClass obj=new MyClass();
		
		MyClass obj1=MyClass.getObject();
		obj1.setId(10);
		System.out.println(obj1);
		
		MyClass obj2=MyClass.getObject();
		obj2.setId(20);
		System.out.println(obj2);
		

	}

}
