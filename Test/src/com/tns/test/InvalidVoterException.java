package com.tns.test;

public class InvalidVoterException extends Exception {

	InvalidVoterException() 
	{
		 super("Invalid age.");
	}
	
	InvalidVoterException(String Msg) 
	{
		 super(Msg);
	}
}
