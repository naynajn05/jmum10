package com.tns.encapsulationdemo;

public class Student {
	//date member
	private String studentName;
	private int studentId;
	private int studentAge;
	
	
	
	
	//getters and setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	
	public void displayData()
	{
		System.out.println("Student class");
	}
	
	//Object Class-prints object details in string format
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentAge=" + studentAge + "]";
	}
	
	
	
}
