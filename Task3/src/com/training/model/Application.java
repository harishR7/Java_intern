package com.training.model;

import com.training.Address;

public class Application {

	public static void main(String[] args) {
		Address address=new Address("Durai Samy", "NSK", 600106);
		MobileBill bill=new MobileBill("Harish", 9841023844L, "prepaid",address);
		
		
		
		System.out.println(bill.findAmount());
		System.out.println(MobileBill.SERVICEPROVIDER);
		System.out.println(bill.toString());
		System.out.println(bill.getAddress());
	}

}
