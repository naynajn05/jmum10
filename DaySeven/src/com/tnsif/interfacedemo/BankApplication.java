package com.tnsif.interfacedemo;

public class BankApplication {

	public static void main(String[] args) {
		Bank bank=new BankImpl(); //Dynamic Binding
		
		Account account=new Account(100,"Israar",60000d,bank);
		
		bank.deposit(account, 10000);
		System.out.println(account);
		bank.withdraw(account, 5000);
		System.out.println(account);
		
		Account account1=new Account(101,"Askan",75000d,bank);
		bank.deposit(account1, 10000);
		System.out.println(account);
		bank.withdraw(account1, 83000);
		System.out.println(account);
		
		
		
		
	}

}
