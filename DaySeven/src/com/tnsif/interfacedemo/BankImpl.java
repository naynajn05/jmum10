package com.tnsif.interfacedemo;

public class BankImpl implements Bank{

	@Override
	public void deposit(Account account, double amount) {
		if(amount>Deposit_Limit)
		{
			System.err.println("Deposit limit exceeds...");
		}else
		{
			account.setBalance(account.getBalance()+amount);
			System.out.println("Rs "+amount+" is deposited "+" to account"+account.getAccNo());
		}
		
	}

	@Override
	public void withdraw(Account account, double amount) 
	{
		if((account.getBalance()-amount)>=Min_Bal)
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println("Rs "+amount+" is withdrawn "+" from account"+account.getAccNo());
		
		}else
		{
			System.err.println("Insufficient balance");
		}
		
	}

}
