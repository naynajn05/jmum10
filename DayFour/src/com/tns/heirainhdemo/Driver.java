package com.tns.heirainhdemo;

public class Driver {

	public static void main(String[] args) {
		//Person p=new Person();   //tight coupling
		
		Person p;
		
		//p=new Person(); //Loose coupling
		p=new Student("Vivek",23,"1222 2222",56,"CSE");
		if(p instanceof Student)
		System.out.println(p);
	//	System.out.println(p instanceof Doctor);
		
				
		p=new Employee("Ashish",24,"1222 2222",11,"HR");
		System.out.println(p);
		
	
		
		

	}

}
