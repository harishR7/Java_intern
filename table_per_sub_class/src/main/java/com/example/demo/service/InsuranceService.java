package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.Insurance;
import com.example.demo.entity.LifeInsurence;
import com.example.demo.iface.InsuranceRepository;

@Service
public class InsuranceService {
	
	@Autowired
	InsuranceRepository repo;
	
	@Autowired
	HealthInsurance heathEntity;
	
	@Autowired
	LifeInsurence lifeEntity;
	
	public void addhealthPolicy() {
		Object obj= repo.save(heathEntity);
		
		if(obj!=null) {
			
			System.out.println("one record added");
		}
	}
	public void addLifePolicy() {
		Object obj= repo.save(lifeEntity);
		
		if(obj!=null) {
			
			System.out.println("one record added");
		}
	}
	public void getHealthPolicy() {
		repo.findAll().forEach(System.out::println);
	}
}
