package com.tnsif.cloneabledemo;

public class Student implements Cloneable {

	private int rollNo;
	private String name;
	private String gender;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student(int rollNo, String name, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
	}

	public void print() {
		System.out.println("Name " + name + " " + "Roll No " + rollNo + " " + "Gender " + gender);
	}

	
	/*
	 * public Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */
	
	public Student clone() throws CloneNotSupportedException
	{
	  return (Student)super.clone();	
	}
}
