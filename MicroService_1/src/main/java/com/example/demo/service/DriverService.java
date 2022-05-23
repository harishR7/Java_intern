package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;

@Service
public class DriverService {

	

	private DriverRepository repo;
	
	@Autowired
	public DriverService(DriverRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<Driver> findAll() {
		return this.repo.findAll();
	}
	
	public Driver addDriver(Driver entity) {
		return this.repo.save(entity);
		
	}
	
	public Driver findById(int id) {
		return this.repo.findById(id).orElseThrow(() -> new RuntimeException(id+"NotFound"));
				
	}
	public void deleteById(int id) {
		
	this.repo.deleteById(id);
		
	}
	
	public Driver remove(Driver entity) {
		boolean result=this.repo.existsById(entity.getDriverId());
		
		if(result) {
			this.repo.delete(entity);
		}
		else {
			throw new NoSuchElementException("Element with id="+entity.getDriverId()+"Not present");
		}
		return entity;
	}
	
	public List<Driver>findByDriverName(String srcname){
		return this.repo.findByDriverName(srcname);
	}
	
	public List<Driver> findByPhoneNumber(long number){
		return this.repo.findByPhoneNumber(number);
	}
//	public List<Driver> findByPhoneNumber1(long number){
//		
//		List<Driver>list=;
//		if() {
//		 }
//		 else {
//			 throw new NoSuchElementException("Not present");
//		 }
//	}
//	
    public List<Driver> searchByRate(double rate){
    	return this.repo.searchByRate(rate);
    }
    
    public int updateRating(int id,double updateRate) {
    	return this.repo.modifyRating(id, updateRate);
    }
    
    public List<Driver> sortedList(String proName){
    	return this.repo.findAll(Sort.by(proName));
    }
}
	

