package com.tns.heirainhdemo;


//child2
public class Employee extends Person {
	private int empId;
	private String dept;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	public Employee(String name, int age, String aadharNo,int empId, String dept) {
		super(name,age,aadharNo);
		this.empId = empId;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", dept=" + dept + ", toString()=" + super.toString() + "]";
	}
	
	

}
