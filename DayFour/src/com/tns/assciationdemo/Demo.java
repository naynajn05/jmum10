package com.tns.assciationdemo;

public class Demo {

	public static void main(String[] args) {
		Address address=new Address("B cabin road","Ambernath","MH",421501);
		Person p=new Person("Nayna",23,address);
		p.displayData();

	}

}
