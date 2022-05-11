package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	public List<Employee> findByDateOfBirth(LocalDate date);
	
	public List<Employee> findByLocation(String str);
	public List<Employee> findBySkillset(String str);
	
	@Query(nativeQuery = true,value="select * from harish_employee1 where location=:loc and skillset=:skill")
	public List<Employee> findByLocationAndSkillset(@Param("loc")String location,@Param("skill")String skill);
}
