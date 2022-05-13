package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.HealthInsurance;
import com.example.demo.entity.LifeInsurence;
import com.example.demo.service.InsuranceService;

@SpringBootApplication
public class TablePerSubClassApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(TablePerSubClassApplication.class, args);
		
		InsuranceService service=ctx.getBean(InsuranceService.class);
		int num=3;
		switch(num) {
		case 1:
			service.addhealthPolicy();
			break;
		case 2:
			service.addLifePolicy();
			break;
		case 3:
			service.getHealthPolicy();
			break;	
		}
		ctx.close();
	}

	@Bean
	public LifeInsurence life() {
		return new LifeInsurence(101, "Madesh", 24, "IT service");
	}
	@Bean
	public HealthInsurance health() {
		return new HealthInsurance(201, "Lokesh", 56, "diabetic");
	}
}
