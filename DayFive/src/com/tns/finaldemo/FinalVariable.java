package com.tns.finaldemo;

public class FinalVariable {
	
	//final int a; //final variable should be initialized
	
	final int a=10;
	final static int b;
	
	final static int c=20;
	
	//instance method
	void change()
	{
		//a=59; 
		b=34;
	}
	
	static
	{
		b=12;
		//a=20;
	}
	
	

}
