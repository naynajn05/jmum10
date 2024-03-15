
//to demonstrate single level inher.
package com.tns.singleleveldemo;


//Parent class
public class Citizen {
	private String aadharNo;
	private String name;
	private int age;
	private String state;
	
	//getters and setters
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	//Default constructor
	
	public Citizen() {
		super();
	}
	
	//Parametrized cons.
	public Citizen(String aadharNo, String name, int age, String state) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.age = age;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Citizen [aadharNo=" + aadharNo + ", name=" + name + ", age=" + age + ", state=" + state + "]";
	}
	
	

}
