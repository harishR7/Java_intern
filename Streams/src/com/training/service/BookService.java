package com.training.service;

import java.util.List;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Comparator;

import static java.util.stream.Collectors.*;

import com.training.Book;
import com.training.iface.CrudRepository;

public class BookService implements CrudRepository {
	
	
	private ArrayList<Book>bookList;
	
	public BookService() {
		super();
		// TODO Auto-generated constructor stub
		this.bookList=new ArrayList<>();
	}

	
	@Override
	public boolean add(Book book) {
		
		
		//boolean result=bookList.add(book);
		//return result;
		
		return bookList.add(book);
	}

	@Override
	public Book findbyId(int id) {
		// TODO Auto-generated method stub
	      for(Book eachvalue:bookList) {
	    	  if(id==eachvalue.getBookNumber()) {
	    		 return eachvalue;
	    	  }
	    	  
	      }
	      return null ;
	}

	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub.
		return bookList.remove(book) ;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}


	@Override
	public Book update(Book book) {
		 if(this.bookList.contains(book)) {
			 System.out.println("Inside if block ######");
		 }
		 else {
			 System.out.println("Inside Else Block #####");
			   add(book);                 //this.bookList.add(book)
		 }
		return null;
	}


	@Override
	public Book update(Book oldbook, Book newBook) {
		 
		if(this.bookList.contains(oldbook)) {
			int pos =bookList.indexOf(oldbook);
			bookList.set(pos, newBook);
		}
		return newBook;
	}
	
	public List<Book> getBookGrtThan(double price){
		// write using predicate and forEach
		
		Predicate<Double> grtThan=(value)->value>price;
		List<Book>list=new ArrayList<>();
		
		
	this.bookList.forEach(book ->
	{
		
		double bookPrice=book.getPrice();
		if(grtThan.test(bookPrice)) {
			list.add(book);
		}
	});
	return list;
}

	
	
	// Using stream 
	
	public List<Book> findBooksGrtThan (double price){
		//e =eachelement
		return this.bookList
		            .stream()
		               .filter((e) ->e.getPrice()>price)
		            		   .collect(toList());
	}
	
	// Sorted method using Comparator
	public List<Book> sortedByName(){
		return this.bookList.stream()
				.sorted(Comparator.comparing(Book :: getBookName))
			     .collect(toList());
	}
	
	
	// Sorted method using reverse order
		public List<Book> sortedByNumeberReverse(){
			return this.bookList.stream()
					     .sorted(Comparator.reverseOrder()) // we are using comparable in Book so it is reverse using bookNumber
				           .collect(toList());
		}
		
	// map Method
	   public List<String>getBookNames(){
		   
		   return this.bookList
				       .stream()
				         .map(e -> e.getBookName()).collect(toList());
		   
		   
	   }
	   
	 // using map ,filter   
	   public List<String>getBookNameGrtThanPrice(double price){
		   return this.bookList
				        .stream()
				         .filter(e -> e.getPrice()>price)
				          .map(e -> e.getBookName())
				           .collect(toList());
				   
	   }
}
		


	
	

