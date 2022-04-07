package com.training.service;

import com.training.model.BankAccount;

public class Application {

	public static void main(String[] args) {
		
		BankAccountService service=new BankAccountService();
		// TODO Auto-generated method stub
		
		BankAccount ram= new BankAccount(5000,"Ramesh",5000);
		
		double simpleInterest=service.calculateInterest(ram);
		System.out.println("Simple Interest:="+simpleInterest);
		
		
		BankAccount shyam= new BankAccount(6200,"Rajesh",5000);
		double simpleInterest2=service.calculateInterest(shyam);
		System.out.println("Simple Interest:="+simpleInterest2);
		
//		BankAccount [] accounts=new BankAccount[2];
//		accounts[0]=ram;
//		accounts[1]=shyam;
		//service.calculateInterest(accounts);
		
		BankAccount[] accounts= {ram,shyam};
		service.calculateInterest(accounts);
		System.out.println("============================");
		double [] values= service.findInterestByAccountType(accounts);
		
		for(double exactValue:values){
			System.out.println(exactValue);
		}
		
		BankAccount [] accountList= {
				new BankAccount(800,"rahul",5000,"savings"),
				new BankAccount(800,"loki",6000,"fixed"),
				new BankAccount(800,"Tom",8000,"recurring")
				
		};
		System.out.println("============================");
		double [] interestValue=service.findInterestByAccountType(accountList);
		for(double values1:interestValue) {
			System.out.println(values1);
		}
	}

}
