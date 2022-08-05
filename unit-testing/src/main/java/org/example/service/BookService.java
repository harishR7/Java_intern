package org.example.service;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.example.model.Book;

public class BookService {

	
	private Set<Book> bookList;
	
	public Set<Book> getBookList(){
		return this.bookList;
	}
	
	
	
	public BookService() {
		super();
		this.bookList = new HashSet<Book>();
	}


public int addBook(Book entity) {
	return (this.bookList.add(entity)?1:0);
}

public boolean removeBook(Book book) {
	
	boolean result = false;
	if(this.bookList.contains(book)) {
		
		this.bookList.remove(book);
		result = true;
	}else {
		
		throw new RuntimeException("Element Not Found");
	}
	return result;
}



public List<String> getBestBooks(){
	List<String> list= Arrays.asList("FaceBook","CookBook","Head First Java");
	return list;
}
	
}
