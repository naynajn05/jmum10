package com.tns.encapsulationdemo;

public class EncapsulationDemo {

	public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student();
	
	s1.setStudentAge(12);
	s1.setStudentId(10);
	s1.setStudentName("Bhakti");
	s2.setStudentAge(18);
	s2.setStudentId(11);
	s2.setStudentName("Askan");
	
	System.out.println(s1);
	System.out.println(s2);

	}

}
