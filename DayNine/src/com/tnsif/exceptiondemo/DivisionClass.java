package com.tnsif.exceptiondemo;


import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionClass {
	public static void divide()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			System.out.println(c);
		}catch (ArithmeticException e) {
			System.err.println("Division exception "+e.getMessage());
		}catch(InputMismatchException ime)
		{
			System.err.println("Wrong input type "+ime.getMessage());
		}catch(Exception e)
		{
			System.err.println("Wrong input type "+e.getMessage());
		}
		
	}

}
