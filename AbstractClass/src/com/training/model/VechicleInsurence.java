package com.training.model;

public class VechicleInsurence extends Insurance {
	
	private String vechicleModel;
	private int yearOfmanufacture;
	
	
	
	public VechicleInsurence() {
		super();
		// TODO Auto-generated constructor stub
	}



	public VechicleInsurence(int policyNumber, String policyHolderName, String vechicleModel, int yearOfmanufacture) {
		super(policyNumber, policyHolderName);
		this.vechicleModel = vechicleModel;
		this.yearOfmanufacture = yearOfmanufacture;
	}




	public String getVechicleModel() {
		return vechicleModel;
	}



	public void setVechicleModel(String vechicleModel) {
		this.vechicleModel = vechicleModel;
	}



	public int getYearOfmanufacture() {
		return yearOfmanufacture;
	}



	public void setYearOfmanufacture(int yearOfmanufacture) {
		this.yearOfmanufacture = yearOfmanufacture;
	}



	@Override
	public double calculatePremium() {
		double premium=1000;
		if(yearOfmanufacture<2020 && vechicleModel.equals("car")) {
			premium=2000;
		}
		return premium;
	}
	

	
}
