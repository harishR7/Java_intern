package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.enitity.bidirection.Doctor;
import com.example.demo.enitity.bidirection.Patient;
import com.example.demo.entity.util.bidirection.Utility;
import com.example.demo.iFace.bidirection.DoctorRespository;


@SpringBootApplication
public class SpringDataJpsOneToManyBidirectionalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=	SpringApplication.run(SpringDataJpsOneToManyBidirectionalApplication.class, args);
		
		
	 Utility util=ctx.getBean(Utility.class);
		
		
		
		int num=3;
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
			util.findDoctorFromPatient();
			break;
		default:
			
	}
		
		
		
	}


	@Bean
	public com.example.demo.enitity.bidirection.Doctor munna() {
		
		Doctor doc=new Doctor();
		doc.setDoctorId(101);
		doc.setDoctorName("Madesh");
		doc.setPhoneNumber(9840233246L);
		doc.setDepartment("General");
		return doc;
	}
	
	@Bean
	public Patient loki() {
		return new Patient(201, "Lokesh", 9821356469L);
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


