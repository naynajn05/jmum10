//Program to demonstrate unchecked exception
package com.tnsif.exceptiondemo;

//Unchecked Exceptions are Runtime Exception
public class UncheckedException {

	public static void main(String[] args) {
		int x[];
		try {
			x = new int[] { 1, 2, 3, 4 };
			System.out.println(x[8]);// out of bound
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Specified index does not exist. " + e.getMessage());// to get the detail message of																				// exception as a string value.

		}
	}
}
