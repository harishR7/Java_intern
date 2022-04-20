package com.training;
import java.util.*;

import com.training.iface.CrudRepository;
import com.training.service.BookService;
//import com.training.util.BookNameComparator;

public class App {
	public static void print( List<Book>book) { //Collection<Book> can also  can be used because its a super class
		for(Book eachvalue: book) {
			System.out.println(eachvalue);
		}
	}

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("Ramesh");
		names.add("Anand");
		names.add("Chandru");
		names.add("Zahir");
		names.add("Pavan");
		
		System.out.println(names);
		
		
		Collections.sort(names);
		
		System.out.println(names);
		
		

		Book java=new Book(101, "Java", "suba", 900);
		Book spring=new Book(102, "Spring", "Mad", 650);
		Book maven=new Book(103, "maven", "Harish", 450);
		Book html=new Book(104, "html", "Loki", 950);
		Book python=new Book(105, "Python", "Dhanush", 450);
		
		CrudRepository service=new BookService();
		
		service.add(java);
		service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		
		
		List<Book> list =service.findAll();
		Collections.sort(list);
		System.out.println("Sort by Book Number");
		print(list);
		
		
//		
//		Collections.sort(list,new BookNameComparator());
//		System.out.println("Sort by Book Name");
//		print(list);
//		
		
		System.out.println("Greater than value ");
		List<Book> bookLists=((BookService)service).getBookGrtThan(500);
		bookLists.forEach(System.out::println);
		
		//System.out.println(((BookService)service).getBookGrtThan(20));
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
/*                                         Stream Concept                                                 */

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("========================================");
		System.out.println("                                           ");
		System.out.println("                                           ");

		System.out.println("                                           ");

		//Using Streams          
		System.out.println("Using Streams");
		   ((BookService)service)
				           .findBooksGrtThan(500)
				           .forEach(System.out::println);
		   
		   System.out.println("========================================");
			System.out.println("                                           ");
			System.out.println("                                           ");
			// Using map,filter
		   
		List<String> namelist=((BookService )service).getBookNames();
		namelist.forEach(System.out::println);
		
		
		
		 System.out.println("========================================");
		 
		List<String> grtThanNineHundred=((BookService )service).getBookNameGrtThanPrice(900);
		grtThanNineHundred.forEach(System.out::println);
		
		
		System.out.println("========================================");
		System.out.println("using Sortbyname");
		List<Book> sortedByName =((BookService)service).sortedByName();
		sortedByName.forEach(System.out::println);
		
		System.out.println("========================================");
		System.out.println("using SortbyNumberInRev");
		List<Book> sortedByNumberRev =((BookService)service).sortedByNumeberReverse();
		sortedByNumberRev.forEach(System.out::println);
		
	}

}
