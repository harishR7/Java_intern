package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.aopalliance.aop.AspectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.iface.PassengerRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition(info= @Info (title = "Passenger Service API",version = "1.0"))
@SpringBootApplication
public class SpringBootDataJpaRestServiceApplication {

	public static void main(String[] args) {
	SpringApplication.run(SpringBootDataJpaRestServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			
			 
			
			@Autowired
			private PassengerRepository repo;
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				Passenger pass=new Passenger();
				pass.setPassengerId(101);
				pass.setPassengerName("Madesh");
				pass.setEmail("madesh123@gmail.com");
				pass.setLocation("Chennai");
				
				List<TripHistory> triplist=Arrays.asList(new TripHistory(201, LocalDateTime.of(LocalDate.of(2022, 11, 16), LocalTime.of(10, 30)), "Chennai", "London", 40000));
				
				pass.setTrip(triplist);
				
				repo.save(pass);
			}
		};
	}
	
	

}
