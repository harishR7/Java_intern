package com.training;


import java.util.Optional;

public class Usingoptional {
public static Optional<String>getValue(int key) {
		
		Optional <String> response=Optional.empty();
		if(key==1) {
			response=Optional.of("hi");
		}
		return response;
}
		
		
		
	
	public static Object getString(int key) {
		
		
		
		
		
	switch(key){
			case 1:
				return new String("Chocobar");
			case 2:			
				return new StringBuffer("MilkyBar");
			default:
				return null;
		} 
	}
	
	public static void main(String arr[] ){
		
		
		
		// will throw null pointer exception for value 3 and above
	//	System.out.println(getString(3).toString());
		System.out.println(getString(2).toString());
		
		
		// to avoid nullpointer exception and return a default value
		// new feature of java 8 Optional is used 
		
		Optional<Object> optional=Optional.ofNullable(getString(3));
		
		System.out.println(optional.orElse("Vannila"));
		
		
		
		
		// using ispresent
   Optional<Object> op2=Optional.ofNullable(getString(3));
		
		if(op2.isPresent()) {
			System.out.println("Value is present="+op2.get());
		}
		else {
			System.out.println("value is not present");
		}
		
		
		
		
		//Using lambda expression using optional
		Optional<Object> op3=Optional.ofNullable(getString(2));
		
		op3.orElseThrow( () -> new RuntimeException("No object for value 3 try again "));
		
		
		
		// Call the getvalue method by passing 1 as argument
		//call the same method again by passing 2 as argument
		//print the result
		Optional<String>resp= getValue(2);
		if(resp.isPresent()) {
			System.out.println(resp.get().toString());
		}
		else {
			System.out.println("Invalid Choice Enter 1");
		}
		
		
		
		// using same method but throw exception
		Optional<String>resp1= getValue(1);
		if(resp1.isPresent()) {
			System.out.println(resp1.get().toString());
		}
		else {
			 resp1.orElseThrow(() -> new RuntimeException("Invalid choice enter 1 working with throw"));
		}
	}
}
