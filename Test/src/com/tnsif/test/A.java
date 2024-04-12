package com.tnsif.test;

public class A {
	
	public static void main(String[] args) {
		System.out.println("I am in main method");
		int numberOne, numberTwo, numberThree;
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Enter First number: ");
				numberOne = sc.nextInt();
				System.out.println("Enter Second number: ");
				numberTwo = sc.nextInt();
				numberThree = numberOne / numberTwo;
				System.out.println("Division is " + numberThree);
				// break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input." );
			}catch() {
				
			}
		}
