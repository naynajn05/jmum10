package com.tns.assciationdemo;


//container class
public class Person {
	private String name;
	private int age;
	//dependency
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void displayData()
	{
		System.out.println("Name of the Perspn "+name+"age of the person "+age
				+address.getStreet()+address.getCity()+address.getState()+address.getZipcode());
	}
	
	

}
