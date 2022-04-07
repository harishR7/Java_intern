package com.training.model;

import com.training.poly.Automobile;

public class Application {
	
	public static void main(String []arr) {
		ObjectFactory factory=new ObjectFactory();
		Automobile maruti=factory.getObject(1);
		Automobile toyota=factory.getObject(2);
		
		System.out.println(factory.getObject(3));
		factory.printQuote(toyota);
	}
}
