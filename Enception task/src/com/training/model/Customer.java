package com.training.model;

import com.training.InvalidEmailException;

public class Customer {
	private int customerId;
	private String customerName;
	private long phoneNumber;
	private String email;
	
	public Customer(int customerId, String customerName, long phoneNumber, String email) {
		super();
		
			if(checkEmail(email)) {
			this.customerId = customerId;
			this.customerName = customerName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			}
			else {
			try {
				throw new InvalidEmailException("regular expression is missing ");
			} catch (InvalidEmailException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws InvalidEmailException {
		if
			(checkEmail(email)) {
			this.email=email;
		} else {
			throw new InvalidEmailException("regular expression is missing ");
		}
		
	}
	
	public boolean checkEmail(String email) {
		if(email.endsWith(".com") || email.endsWith(".in") || email.endsWith(".org")){
			if(email.contains("@")) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
