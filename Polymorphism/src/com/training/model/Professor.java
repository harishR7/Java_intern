package com.training.model;

import com.training.ifaces.Conditional;

public class Professor implements Conditional {
	private String qualification;
	
	
	
	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	


	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}



	@Override
	public boolean test(Object value) {
		// in this super class is object so the tolowercase will not get  
		//to run we need to change to string
		//value.toLowerCase
		String strValue=(String)value;
		boolean result=false;
		if(strValue.toLowerCase().equals("chennai")) {
			result=true;
		}
		return result;
	}



	@Override
	public String toString() {
		return "Professor [qualification=" + qualification + "]";
	}

}
