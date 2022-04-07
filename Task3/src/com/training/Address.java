package com.training;

public class Address {
	private String streetAddress;
	private String streetArea;
	private int pincode;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String streetAddress, String streetArea, int pincode) {
		super();
		this.streetAddress = streetAddress;
		this.streetArea = streetArea;
		this.pincode = pincode;
	}


	public String getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


	public String getStreetArea() {
		return streetArea;
	}


	public void setStreetArea(String streetArea) {
		this.streetArea = streetArea;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", streetArea=" + streetArea + ", pincode=" + pincode + "]";
	}
	
	
}
