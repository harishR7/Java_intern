package com.training.model;

public class LifeInsurance extends Insurance {

	// Add a property Age
	private int age;
	
	//Add Constructor and Setter getter method
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
// override calculate Premium Method,if age<50 premium is 5000 else 1000
	@Override
	public double calculatePremium() {
		double value=10000;
		if(age<50) {
			value=5000;
		}
		return value;
	}

	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LifeInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}

	public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		this.age = age;
	}
	
	
	
}
