package com.training;

import com.training.model.Customer;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ram= new Customer(120,"Harish",8546848654L,"harishgmail.com");
		System.out.println(ram.getEmail());
	}

}
