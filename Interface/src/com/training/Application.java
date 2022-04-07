package com.training;

import com.training.iFaces.CheckCondition;
import com.training.iFaces.Conditional;
import com.training.iFaces.Function;
import com.training.services.CurrencyConverter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subType=new subType 
		//CurrencyConverter convert=new CurrencyConverter();
		
		
		//superType=new subType
		Function convert=new CurrencyConverter();
		
		
		System.out.println(Function.COUNTER);
		
		double response=convert.apply(200);
		System.out.println(response);
		
		
		
		//line 13&15 and Line 18 are identical
		System.out.println(convert.apply(300));
		if(convert instanceof CheckCondition) {
			CheckCondition obj =(CheckCondition)convert;
			System.out.println("this discount :"+obj.test(300));
		}
		
		Conditional condObj=new DiscountCalculator();
		
		System.out.println(condObj.test(6000));
		System.out.println(condObj.negate(5000));
		
		
		System.out.println(convert instanceof CheckCondition);
	}

}
