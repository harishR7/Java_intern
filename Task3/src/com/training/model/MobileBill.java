package com.training.model;

import com.training.Address;

public class MobileBill {
	private String customerName;
	private long mobilenumber ;
	private String planName;
	private Address address;
	int value;
	
	public static final String SERVICEPROVIDER ="Airtel";
	

	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileBill(String customerName, long mobilenumber, String planName, Address address) {
		super();
		this.customerName = customerName;
		this.mobilenumber = mobilenumber;
		this.planName = planName;
		this.address = address;
		
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		
		return "MobileBill[customerName="+customerName+"mobilenumber="+mobilenumber+" PlanName="+planName+"Address="+address;
	}





	public void setAddress(Address address) {
		this.address = address;
	}





	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public long getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public String getPlanName() {
		return planName;
	}


	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	
	public int findAmount() {
		String amount=getPlanName().toLowerCase();
		
		switch(amount) {
		case "prepaid":
			value=200;
			break;
		case "postpaid"	:
			value=300;
			break;
		default:
			value=-1;
			break;
		}
		return value;
	}
	
}
