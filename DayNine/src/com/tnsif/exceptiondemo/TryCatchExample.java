package com.tnsif.exceptiondemo;

import java.util.Scanner;

public class TryCatchExample {

	static int DivideNo(int a, int b) {
		int result = 0;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("In Try block");
			result = a / b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("In catch block");
			System.err.println("Exception occured due to division " + e.getMessage());
		} finally {
			System.out.println("In finally block");
			sc.close();
			
		}
		return result;

	}

}
