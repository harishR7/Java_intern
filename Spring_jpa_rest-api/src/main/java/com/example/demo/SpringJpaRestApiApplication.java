package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Driver;
import com.example.demo.repo.DriverRepository;

@SpringBootApplication
public class SpringJpaRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRestApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			DriverRepository repo;
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				
				
				repo.save(new Driver(102,"Ramesh",123813143,4.2));
			}
		};
	}
}
