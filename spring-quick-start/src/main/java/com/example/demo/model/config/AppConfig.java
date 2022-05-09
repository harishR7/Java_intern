package com.example.demo.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;
import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

@Configuration
public class AppConfig {
	
	// ID of the bean as the method name
	@Bean
	public Student maddy() 
	{
		 return new Student(101,"Ramesh",80);
	}
	
	@Bean
	public Teacher loki() {
		return new Teacher(102,"Lokesh","CSE");
	}
	
	@Bean
	public Product tv() {
		return new Product(101, "TV");
	}
	
	@Bean
	public Customer suresh() {
		return new Customer(202,"Suresh");
	}
	
	@Bean
	public Customer magesh() {
		return new Customer(203,"Magesh");
	}
	
	@Bean
	public Customer rajesh() {
		return new Customer(204,"Rajesh");
	}
}
