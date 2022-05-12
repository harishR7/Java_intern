package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.repo.Seminarrepository;

@Component
public class SeminarUtil {
	
	@Autowired
	Seminarrepository repo;
	
	@Autowired
	Seminar semi;
	
	@Autowired
	Speaker speaker;
	
	public void create() {
		
		semi.setSpeaker(speaker);
		Seminar sem=repo.save(semi);
		if(sem!=null) {
			
		System.out.println("one row add");
		
		}
	}
	public void findAll() {
		repo.findAll().forEach(System.out::println);
	}
}
