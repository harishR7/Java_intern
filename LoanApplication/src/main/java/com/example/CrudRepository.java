package com.example;

import java.util.List;

public interface CrudRepository<T> {
	
	public int add (T obj);
	public List <T> findAll();
	public T findById(int id);
	public int remove(int id);
	public int update (int Id,T member);
}
