//Program to demonstrate FunctionalInterface - Child Class
package com.tnsif.functionalinterfaces;

public class GreetClass implements GreetInterface {

	@Override
	public String greet() {		
		return "Welcome to the world of Java";
	}

}
