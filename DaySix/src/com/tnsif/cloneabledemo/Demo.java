package com.tnsif.cloneabledemo;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(12,"Pranjal","female");
		
		//Student s2=(Student)s1.clone();
		Student s2=s1.clone();
		
		s1.print();
		s2.print();
		

	}

}
