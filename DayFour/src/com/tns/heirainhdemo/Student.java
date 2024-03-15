package com.tns.heirainhdemo;


//child 1
public class Student extends Person {
	private int rollNo;
	private String branch;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student(int rollNo, String branch) {
		super();
		this.rollNo = rollNo;
		this.branch = branch;
	}
	public Student() {
		super();
	}
	public Student(String name, int age, String aadharNo,int rollNo, String branch) {
		super(name,age,aadharNo);
		this.rollNo = rollNo;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", branch=" + branch + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
