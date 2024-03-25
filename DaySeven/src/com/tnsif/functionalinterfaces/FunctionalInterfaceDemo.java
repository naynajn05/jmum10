//Program to demonstrate FunctionalInterface
package com.tnsif.functionalinterfaces;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		//using Lambda Expression
		GreetInterface g1=()->"Hello";
		System.out.println(g1.greet());

	}
}
