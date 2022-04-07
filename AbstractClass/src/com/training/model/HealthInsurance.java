package com.training.model;

public class HealthInsurance extends Insurance {
	private String[] preExisitingDiseases;
	
	
	
	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}



	public HealthInsurance(int policyNumber, String policyHolderName) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}



	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExisitingDiseases) {
		super(policyNumber, policyHolderName);
		this.preExisitingDiseases = preExisitingDiseases;
	}
	


	public String[] getPreExisitingDiseases() {
		return preExisitingDiseases;
	}



	public void setPreExisitingDiseases(String[] preExisitingDiseases) {
		this.preExisitingDiseases = preExisitingDiseases;
	}



//	@Override
//	public double calculatePremium() {
//		double premium=10000;
//		for(String eachItem:preExisitingDiseases) {
//			String item=eachItem.toLowerCase();
//			if(item.equals("bp")  || item.equals("sugar")) {
//				premium=15000;
//			}
//			
//			
//		}
//		return premium;
//	}
	@Override
	public double calculatePremium() {
		double premium=10000;
		for(String eachItem:preExisitingDiseases) {
			//String item=eachItem.toLowerCase();
			if(eachItem.equalsIgnoreCase("bp")  || eachItem.equalsIgnoreCase("sugar")) {
				premium=15000;
			}
			
			
		}
		return premium;
	}
}
	

