package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.util.DoctorUtils;

@SpringBootApplication
public class SpringDataJpsOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpsOneToManyApplication.class, args);
		DoctorUtils util=ctx.getBean(DoctorUtils.class);
		
		
		
		int num=2;
		switch(num) {
		case 1:
			// adding rows
			util.create();
			break;
		
	    case 2:
		// adding rows
		util.findAll().forEach(System.out::println);
		break;
	    case 3:
			// adding rows
			util.findAllBySpec();
			break;
	}
		
		
		
	}


	@Bean
	public Doctor munna() {
		
		Doctor doc=new Doctor();
		doc.setDoctorId(101);
		doc.setDoctorName("Lokesh");
		doc.setPhoneNumber(9840233246L);
		doc.setDepartment("ent");
		return doc;
	}
	
	@Bean
	public Patient mad() {
		return new Patient(201, "Madesh", 9821356469L);
	}
	@Bean
	public Patient venkat() {
		return new Patient(202, "Venkat", 9821745643L);
	}
	@Bean
	public Patient praveen() {
		return new Patient(203, "Praveen",988643423L);
	}
	@Bean
	public Patient kawin() {
		return new Patient(204, "Kawin",  986743456L);
	}
		
	}

