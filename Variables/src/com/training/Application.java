package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount("Ramesh",1000);
		
		System.out.println(account.getUpdateBalance(2000));
		
		System.out.println(account.getAccountNumber());
		
		System.out.println(account.getUpdateBalance(3000));
		
		//System.out.println(BankAccount.getCount());
		
		BankAccount account2=new BankAccount("Suresh",2000);
		
		System.out.println(account2.getUpdateBalance(3000));
		System.out.println(account2.getAccountNumber());
		
		
	}

}
