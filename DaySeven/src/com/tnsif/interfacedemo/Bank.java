package com.tnsif.interfacedemo;

public interface Bank {
	
	
	double Min_Bal=10000;
	double Deposit_Limit=25000;
	
	
	void deposit(Account account,double amount);
	
	void withdraw(Account account,double amount);
	

}
