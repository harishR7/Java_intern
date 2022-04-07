package com.training.model;

import com.training.MarutiCar;
import com.training.ToyotaCar;
import com.training.poly.Automobile;

public class ObjectFactory {
	
	public Automobile getObject(int key) {
		Automobile vechile=null;
		switch(key) {
		case 1:
			vechile=new MarutiCar();
			break;
		case 2:
			vechile=new ToyotaCar();
		}
		return vechile;
		
	}
	public void printQuote(Automobile poly) {
		
		
		System.out.println(poly.getColor());
		System.out.println(poly.getModel());
		System.out.println(poly.getPrice());
	}

}
