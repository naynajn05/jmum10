package com.tns.singleleveldemo;

//child class
public class Student extends Citizen {
	
	private int rollNo;
	private String course;
	private String collegeName;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public Student() {
		super();
	}
	public Student(String aadharNo, String name, int age, String state,int rollNo, String course, String collegeName) {
		super(aadharNo,name,age,state);
		this.rollNo = rollNo;
		this.course = course;
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", course=" + course + ", collegeName=" + collegeName + ", getAadharNo()="
				+ getAadharNo() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getState()=" + getState()
				+ "]";
	}
	
	
	
	

}
