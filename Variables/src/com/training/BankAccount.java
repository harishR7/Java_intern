package com.training;

public class BankAccount {
	
	// Static variable
	private static int count;
	
	//Instance variable
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	
	//Static method
	public static int getCount() {
		
		return ++count;
	}
	
	// instance method
	public double getUpdateBalance(double amount )//parameter variable) 
			{
		//local variable
		//double updatedBalance;
		// local variable
		double currentBalance;
		this.balance=this.balance+amount;
		
		//local variable should be initialized before using
		//System.out.println(updatedBalance);
		return this.balance;

	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber=getCount();
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void setCount(int count) {
		BankAccount.count = count;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	
	
	
}
