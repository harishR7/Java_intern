package com.example.demo.ifaces;

import java.util.List;
import java.util.Optional;



public interface CrudRespostory<T> {
	
	public int add(T t);
	public List<T>findAll();
	public int delete(int id);
	public T findbyId(int id);
	public int update(T t);
 public Optional<T> findByIdUsingOptional(int id);
	
}
