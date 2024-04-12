package com.tnsif.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.tnsif.bussinesslogic.ArithmeticOperations;

//@Disabled
public class MyTestClass {
	
	//@Disabled
	@Test
	public void squareTest()
	{		
		int sq=ArithmeticOperations.getSquare(5);
		assertEquals(25, sq);
	}
	
	@Test
	public void MaxArrayTestOne()
	{
		int a[]= {-12,-23,-34,-5,-30};
		int max=ArithmeticOperations.findMaximum(a);
		assertEquals(-5, max);
	}
	
	@Test
	public void MaxArrayTestTwo()
	{
		int a[]= {12,0,23,34,5,-30};
		int max=ArithmeticOperations.findMaximum(a);
		assertEquals(34, max);
	}
	
	@Test
	public void palindromeTestOne()
	{
		//assertTrue(ArithmeticOperations.checkPalindrome(121));
	boolean status=	ArithmeticOperations.checkPalindrome(121);
	
	assertEquals(true, status);
	}
	
	@Test
	public void palindromeTestTwo()
	{
		assertFalse(ArithmeticOperations.checkPalindrome(123));		
	}
}
