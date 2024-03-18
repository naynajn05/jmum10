
//to demonstrate static method and static block
package com.tns.staticdemo;

public class MyClass {

	private int branchId;
	private static int noOfStudents;

	static {
		System.out.println("In static block");
		noOfStudents = 50;
	}

	public MyClass() {
		System.out.println("in default constructor");
		branchId++; //1
		noOfStudents++; //51 //52

	}

	@Override
	public String toString() {
		return "MyClass [branchId=" + branchId + "]";
	}
	
	public void show()
	{
		System.out.println(branchId);
		System.out.println(noOfStudents);
	}
	
	//static method
	public static void addStudent()
	{
		//System.out.println(branchId);
		System.out.println(noOfStudents);
	}

}
