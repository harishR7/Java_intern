package com.training.model;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.*;

public class UsingPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names= 
				Arrays.asList("India","Srilanka","Indonesia","Bhutan");
		
		
		Predicate<String>containsChar=
				(country)->country.toLowerCase().startsWith("I");
				
				
		Consumer<String> consumer=(value)-> System.out.println(value);		
				names.forEach(consumer);
				
				names.forEach((value)-> System.out.println(value));
				
				// Its optional
				
		Consumer<String >consumer1=(value)->
		{
			if(containsChar.test(value)) {
				System.out.println(value);
			}
		};
		
		names.forEach(consumer1);
	}

}
