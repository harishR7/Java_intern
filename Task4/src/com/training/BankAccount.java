package com.training;

public abstract class BankAccount {
	
	private String accountHolderName;
	private long accountNumber;
	private double balance;
	
	
	
	
	
	public abstract double deposit(double amount);
	public abstract double withdraw(double amount);
}
