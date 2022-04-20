package com.training;
import java.util.*;
import java.util.stream.*;
import static  java.util.stream.Collectors.*;
public class UsingStreams {

	// Using Distinct in intermediate
	
	public static void useDistinct(List<Book> bookList) {
		bookList.stream().distinct().forEach(System.out::println);
	}
	
	
	//Using toSet in terminator
	
	public static void collectToSet(List<Book>bookList) {
		Set<Book> bookSet=
				 bookList.stream()
				 .filter(e -> e.getPrice()>500)
				 .collect(toSet());
		
		bookSet.forEach(System.out::println);
	}
	
	
	// Using toMap in terminator
	
	public static void collectToMap(List<Book> bookList) {
//		Set<Book> bookset=bookList.stream().collect(toSet());
		Map<String,Double> values=
				//bookset.stream()
				bookList.stream()
				.filter(e -> e.getPrice()>500).distinct()
				.collect(toMap(Book:: getBookName,Book ::getPrice));
				
		values.forEach((key,value) -> System.out.println(key +","+value));
	}
	
	// Using Maximum terminator
	
	public static void FindMaxPrice(List<Book> booklist) {
		Optional<Book>optional=
				booklist.stream()
				.max(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
			System.out.println("Maximum Price:="+optional.get().getPrice());
		}
				
	}
	
	// Using Minimum terminator
	
	public static void FindMinPrice(List<Book> booklist) {
		Optional<Book>optional=
				booklist.stream()
				.min(Comparator.comparing(Book::getPrice));
		if(optional.isPresent()) {
			System.out.println("Minimum Price:="+optional.get().getPrice());
		}
				
	}
	
	// Using Count in terminator
	
	public static void FindCount(List<Book>booklist,String searchval) {
		long list =
				booklist.stream().filter(  e  -> e.getBookName().contains(searchval) )
				.count();
		System.out.println(searchval +" Occur:="+list+" Times");
	}

	public static void main(String[] args) {
		
		Book java=new Book(101, "Java", "suba", 900);
		Book spring=new Book(102, "Spring", "Mad", 650);
		Book maven=new Book(103, "maven", "Harish", 450);
		Book html=new Book(104, "html", "Loki", 950);
		Book python=new Book(105, "Python", "Dhanush", 450);
		Book mavenNew=new Book(103, "maven", "Harish", 450);
		Book htmlNew=new Book(104, "html", "Loki", 950);
		
		
		
		List<Book> bookList=
				Arrays.asList(java,spring,maven,html,python,mavenNew,htmlNew);
		
		
		
		System.out.println("Using Distinct in intermediate///////////////////////////////");
		useDistinct(bookList);
		System.out.println("=============================================================");
		System.out.println("Using toSet in terminator ////////////////////////////////////////");
		collectToSet(bookList);
		System.out.println("=============================================================");
		System.out.println("Using  tomap in terminator////////////////////////////////////////");
		collectToMap(bookList);	
		System.out.println("=============================================================");
		System.out.println("Using  Maximum Price////////////////////////////////////////");
		FindMaxPrice(bookList);	
		System.out.println("=============================================================");
		System.out.println("Using  Minimum Price////////////////////////////////////////");
		FindMinPrice(bookList);	
		System.out.println("=============================================================");
		System.out.println("Using  Count////////////////////////////////////////");
		FindCount(bookList,"v");	
		
		
	}

}
