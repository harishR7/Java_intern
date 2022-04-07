package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		
//		int value =Integer.parseInt(args[0]);
//		
//		System.out.println(++value);
		
		CurrencyConvertor conv=new CurrencyConvertor();
		double num =Double.parseDouble(args[0]);
		System.out.println(conv.inrtoUsd(num));
		
		
		
		double inrValue=Double.parseDouble(args[1]);
		System.out.println(conv.inrtoEuro(inrValue));
		
		double salary =42500.00;
		
		int age=42;
		
		int intSal=(int)salary;
		
		System.out.println(intSal);
		
		String strAge=Integer.toString(age);
		System.out.println(strAge);
		
		int intAge=Integer.valueOf(strAge);
		
		System.out.println(intAge);
	}

}
