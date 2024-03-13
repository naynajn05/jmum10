package com.tns.scannerclassdemo;


//Person Entity
public class Person {
	private int age;
	private String gender;
	private double income;
	private String name;
	
	
	
	public Person(int age, String gender, double income, String name) {
		super();
		this.age = age;
		this.gender = gender;
		this.income = income;
		this.name = name;
	}
	private double tax;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double d) {
		this.tax = d;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", gender=" + gender + ", income=" + income + ", name=" + name + ", tax=" + tax
				+ "]";
	}
	
	
	

}
