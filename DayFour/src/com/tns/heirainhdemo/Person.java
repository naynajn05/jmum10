package com.tns.heirainhdemo;

//parent class
public class Person {
	
	private String name;
	private int age;
	private String aadharNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public Person() {
		name="Sneharsh";
		age=22;
		aadharNo="1234 5678 0090";
	}
	public Person(String name, int age, String aadharNo) {
		super();
		this.name = name;
		this.age = age;
		this.aadharNo = aadharNo;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", aadharNo=" + aadharNo + "]";
	}
	
	
	

}
