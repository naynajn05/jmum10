package com.tns.scannerclassdemo;


import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter Gender");
		String gender=sc.next();
		
		System.out.println("Enter income");
		double income=sc.nextDouble();
		
		Person p1=new Person(age,gender,income,name);
		
		TaxCalculation tax=new TaxCalculation();
		tax.calculateTax(p1);
		System.out.println(p1);
		
		
		
		
		
		
		

	}

}
