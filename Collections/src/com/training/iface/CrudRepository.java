package com.training.iface;

import java.util.*;

import com.training.Book;


public interface CrudRepository {
	
	public boolean add(Book book);
	public Book findbyId(int id);
	public boolean remove (Book book);
	public List<Book> findAll();
	public Book update(Book book);
	public Book update(Book oldbook,Book newBook);
}
