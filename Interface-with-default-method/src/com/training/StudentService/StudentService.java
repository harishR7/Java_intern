package com.training.StudentService;

import com.training.ifaces.AgeCondition;
import com.training.ifaces.Conditional;

public class StudentService implements Conditional<Double>,AgeCondition<Double> {

	@Override
	public boolean test(Double t) {
		
		return t>80;
	}
	
	
	
	public boolean negate(Double value) {
		
		//Completely overriding super type with the custome code
		if(value<100) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// one method is calling only super class
/*	@Override
	public boolean negate(Double value) {
		
	return Conditional.super.negate(value);
	}*/

		
		
		
		
		
	// calling both the super type
/*	@Override
	public boolean negate(Double value) {
		
		boolean result1=Conditional.super.negate(value);
		boolean result2=AgeCondition.super.negate(value);
	
		if(result1 && result2) {
			return true;
	}
	else {
		return false;
	}
	
	}*/

	

}
