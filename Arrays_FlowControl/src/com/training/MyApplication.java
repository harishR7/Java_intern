package com.training;

import com.training.model.BankAccount;
import com.training.service.BankAccountService;
import java.util.*;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountService service= new BankAccountService();
		Scanner sc=new Scanner(System.in);
		
		BankAccount list[]=new BankAccount[3];
		int flag;
		int i=0;
		
		do {			
			
			
			System.out.println("AccountNumber:");
			int accountNumber=  sc.nextInt();
			System.out.println("AccountHolderName:");
			String accountHolderName= sc.next();
			
			
			System.out.println("Balance:");
			double balance=sc.nextDouble();
			System.out.println("AccountType:[savings,fixed,recurring");
			String accountType=sc.next();
			System.out.println("Enter the number 0 or1 to continue:");
			flag=sc.nextInt();
					
				BankAccount account1=new BankAccount(accountNumber,accountHolderName,balance,accountType);
			    list[i]=account1;
			    i++;
		}
		while(flag==0) ;
		
		double[] values=service.findInterestByAccountType(list);
		
		for(double eachValue:values) {
			System.out.println(eachValue);
		}
		
			sc.close();
		
		
	}

}
