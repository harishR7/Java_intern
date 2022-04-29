package com.training;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
 

public class HandleDupilicate {

	public static void main(String[] args) {
		
		List<Integer> ageList=Arrays.asList(45,55,65,78,55,80,45);
		
		Set<Integer> filtered=new HashSet<>();
		
		List<Integer> list =ageList
				.stream()
				.filter(e -> !filtered.add(e))
				.collect(toList());
		
		System.out.println(list);
////////////////////////////////////////////////////////////////////////////////////////////////		
		
		List<Integer>list1=Arrays.asList(1,2,3,56,8);
		list1.stream().filter(e -> e%2==0).forEach(System.out::println);
		for(Integer eachValue :list1) {
			System.out.println(list1.indexOf(eachValue));
		}
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		List<Book> book=Arrays.asList(new Book(1001, "Harish", "BOOK", 5000),
				                         new Book(1002, "loki", "BOAT", 4000));
	
		Map<String,Double>map=book.stream().collect(toMap(Book::getBookName,Book::getPrice ));
		
		map.forEach((key,value) -> {System.out.println(key);
		                            System.out.println(value);
		});
		                           
	}

}
