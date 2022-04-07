package com.training;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;

public class Application {

	public static void main(String[] args) {
		
		BankAccount ramAccount=new BankAccount(1010,"Ramesh",5000,"saving");
		System.out.println(ramAccount);
		
		
		
		SavingsAccount account=new SavingsAccount(650, "Ramesh", 1000, "joint", "Rajesh");
		
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getNominee());
		
		SavingAccountService service=new SavingAccountService();
		System.out.println(service.getCustomerInfo(account));
		
		// substitution Principle
		System.out.println(service.calculateInterest(account));
		
		BankAccountService service2=new SavingAccountService();
		//cannot access the cub class method with super class reference
		//service2.getCustomerInfo(account);
		
		SavingAccountService savingService=(SavingAccountService)service2;
		
		//always subclass=super class is not possible
		//SavingAccountService sc2=new BankAccountService();
		
		//superclass= sub class is always right
		BankAccountService service3= new SavingAccountService();
		SavingAccountService service4=(SavingAccountService)service3;
		
		
		System.out.println(savingService.getCustomerInfo(account));
	}

}
