//Program to demonstrate throw keyword
package com.tns.test;

import java.util.Scanner;

public class PercentageValidator {
	/*
	 * static float acceptNumber() { Scanner sc = new Scanner(System.in); int n =
	 * sc.nextInt(); sc.close(); return n; }
	 */
	static void isValidPercentage(float per) throws ArithmeticException {
		if (per >= 0 && per <= 100) {
			System.out.println("Valid percentage: " + per);
		} else {
			throw new ArithmeticException("Percentage should be between 0 and 100");
		}
	}

}
