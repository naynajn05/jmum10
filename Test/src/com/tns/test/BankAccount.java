package com.tns.test;
public class BankAccount {
    private static int totalAccounts = 0; // static variable to track total accounts
    private final int accountNumber; // final variable for account number
    private double balance; // instance variable for balance

    // Constructor to initialize account number and balance
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++; // Increment total accounts on creation
    }

    // Static method to get total number of bank accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }

    // Getter method for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Creating two bank accounts
        BankAccount account1 = new BankAccount(1001, 5000);
        BankAccount account2 = new BankAccount(1002, 3000);

        // Depositing and withdrawing money from accounts
        account1.deposit(1000);
        account2.withdraw(2000);

        // Displaying account information
        System.out.println("Account " + account1.getAccountNumber() + " balance: $" + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: $" + account2.getBalance());

        // Displaying total number of bank accounts
        System.out.println("Total bank accounts created: " + BankAccount.getTotalAccounts());
    }
}
