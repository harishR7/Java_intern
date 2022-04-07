package com.training.services;

import com.training.iFaces.CheckCondition;
import com.training.iFaces.Function;

// a class can only 
//class Dummy extends Function{
//	
//}
public class CurrencyConverter implements Function,CheckCondition {

	@Override
	public double apply(double value) {
		// TODO Auto-generated method stub
		return value*100;
	}

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return value>5000;
	}
	
	
}
