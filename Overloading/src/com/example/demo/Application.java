package com.example.demo;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner sc=new Scanner(System.in);
		
		Converter con =new Converter();
		
		// creating a name input using scanner;
		
		
		System.out.println("Enter the Name:");
		
	    String name=sc.next();
		
	    
	   // creating a Faren input using scanner;
	    
		
		System.out.println("Enter the Farenheit Temp:");
		
		double farenTemp=sc.nextDouble();
		
		
		
		//creating a amount and from input using scanner;
		
		
		System.out.println("Enter the amount:");
		double amount=sc.nextDouble();
		System.out.println("Enter the From:");
		int from=sc.nextInt();
		
	
		
		System.out.println(con.convert(amount, from));
		
		System.out.println(con.convert(name));
		
		System.out.println("Celsius Temp :"+con.convert(farenTemp));
		
		
		sc.close();
		
		
		
		
		
		
	}

}


