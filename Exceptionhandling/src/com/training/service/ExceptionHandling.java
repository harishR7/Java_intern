package com.training.service;

import com.training.model.RangeCheckException;

public class ExceptionHandling {
	public void usingArrayIndexException(String[]args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.err.println("method requides three values o be passed [a,b,c]");
			e.printStackTrace();
		}
	}
	
	public void usingNumberFormatExpection(String value) {
		int age=0;
		try {
			 age=Integer.parseInt(value);
			//System.out.println(age);
		} catch (NumberFormatException e) {
			System.err.println("Use a String number value");
			//e.printStackTrace();
		}
		System.out.println(age);
	}
	
	public void usingFinallyBlock() {
		
		int denominator=0;
		try {
			System.out.println(4/denominator);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Denominator should not be zero");
		}
		 finally {
			 System.out.println("Inside FINALLY==");
		}
		 System.out.println("Thanks,bye,bye");
		
	}
	
	
public String  underStandFinallyBlock() throws RangeCheckException {
		
		int denominator=0;
		try {
			System.out.println(4/denominator);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Denominator should not be zero");
			//return "welcome";
			  throw new RangeCheckException("hello guys");
		}
		 finally {
			 System.out.println("Inside FINALLY==");
		}
		 System.out.println("Thanks,bye,bye");
		 
		return "thanks";
	}
}
