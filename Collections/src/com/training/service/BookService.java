package com.training.service;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;

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
}


	
	

