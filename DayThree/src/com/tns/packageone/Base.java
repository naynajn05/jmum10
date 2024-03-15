package com.tns.packageone;

public class Base {
	
	private int intVar=10;
	int intDefault=20;
	protected int intProtected=40;
	public int intPublic=60;
	
	private void privateMethod()
	{
		System.out.println(intVar);
	}
	
	void defaultmethod()
	{
		System.out.println(intDefault);
	}

	protected void protectedMethod()
	{
		System.out.println(intProtected);
	}
	
	public void publicMethod()
	{
		System.out.println(intPublic);
	}
}
