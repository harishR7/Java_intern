package com.example.loan;

import com.example.customer.Customer;

public class LoanApplication {
	
	private long applicationNumber;
	private Customer customer;
	private double loanAmount;
	
	
	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LoanApplication(long applicationNumber, Customer customer, double loanAmount) {
		super();
		this.applicationNumber = applicationNumber;
		this.customer = customer;
		this.loanAmount = loanAmount;
	}


	public long getApplicationNumber() {
		return applicationNumber;
	}


	public void setApplicationNumber(long applicationNumber) {
		this.applicationNumber = applicationNumber;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	@Override
	public String toString() {
		return "LoanApplication [applicationNumber=" + applicationNumber + ", customer=" + customer + ", loanAmount="
				+ loanAmount + "]";
	}
	
	
}
