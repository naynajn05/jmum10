package com.tns.packagethree;

public class MyClass {
	
	private static MyClass obj=new MyClass(10);
	
	
	private int id;
	
	
	//private constructor
	private MyClass(int id) {
		
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static  MyClass getObject()//Factory class
	{
		
		return obj;
	}

	@Override
	public static String toString() {
		return "MyClass [id=" + id + "]";
	}
	
	

}
