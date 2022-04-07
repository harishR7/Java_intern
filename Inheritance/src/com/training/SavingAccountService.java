package com.training;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;

public class SavingAccountService extends BankAccountService {
	public String getCustomerInfo(SavingsAccount account) {
		return account.getAccountHolderName();
	}

	//OverRidding
	@Override
	public double calculateInterest(BankAccount account) {
		double simpleInterest=0.10;
		if(account.getAccountNumber()<5000) {
				simpleInterest=0.20;
		}
		
		return account.getBalance()*1*simpleInterest;
		
	}
	
}
