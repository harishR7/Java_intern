package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;



@SpringBootApplication
public class SpringDataJpsPracticeTaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpsPracticeTaskApplication.class, args);
		
		Employee siva=ctx.getBean("kawin",Employee.class);
		EmployeeService service=ctx.getBean(EmployeeService.class);
		
		
		
		
		
		int num=5;
		switch(num) {
		case 1:
			// adding employee data
			System.out.println(service.add(siva));
			break;
		case 2:
			// findByDateOfBirth 
			service.findByDateOfBirth(LocalDate.of(2000, 12, 11)).forEach(System.out::println);
			break;
		case 3:
			//findEmployeeByLocation
			service.findEmployeeByLocation("Chennai").forEach(System.out::println);
			break;
		case 4:
			//findEmployeeBySkillset
			service.findEmployeeBySkillset("Java").forEach(System.out::println);
		case 5:
			//findByLocationAndSkillset
			service.findByLocationAndSkillset("Chennai", "Java").forEach(System.out::println);
		}
		
	}
	@Bean
	public Employee loki() {
		return new Employee(101, "Lokesh", LocalDate.of(2000, 12, 11), "Chennai", "Java", 9872343223L);
	}
	@Bean
	public Employee hari() {
		return new Employee(102, "Harish", LocalDate.of(2000, 11, 16), "Chennai", "Java", 985654623L);
	}
	@Bean
	public Employee mad() {
		return new Employee(103, "madesh", LocalDate.of(2001, 8, 10), "Avadi", "Python", 9872385453L);
	}
	@Bean
	public Employee venkat() {
		return new Employee(104, "venkat", LocalDate.of(2002, 9, 6), "Siruseri", "React", 9872387623L);
	}
	@Bean
	public Employee praveen() {
		return new Employee(105, "Praveen", LocalDate.of(2000, 1, 7), "Arcot", "Spring", 9872347554L);
	}
	@Bean
	public Employee kawin() {
		return new Employee(106, "Kawin", LocalDate.of(2000, 12, 11), "T Nagar", "Oracle", 9872397623L);
	}

}
