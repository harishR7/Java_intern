package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> findByDateOfBirth(LocalDate date){
		return this.repo.findByDateOfBirth(date);
	}

	public Employee add(Employee emp) {
		return this.repo.save(emp);
	}
	
	public List<Employee> findEmployeeByLocation(String str){
		return this.repo.findByLocation(str);
	}
	
	public List<Employee> findEmployeeBySkillset(String str){
		return this.repo.findBySkillset(str);
	}
	
	public List<Employee> findByLocationAndSkillset(String location,String skill){
		return this.repo.findByLocationAndSkillset(location, skill);
	}
	
	
	public List<Employee> findByLocationOrSkillset(String location,String skill){ 
		
		return this.repo.findByLocationOrSkillset(location, skill);
	}
	
}
