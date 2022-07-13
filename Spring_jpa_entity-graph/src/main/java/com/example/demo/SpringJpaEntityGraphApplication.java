package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.User;
import com.example.demo.repo.AddressRepository;
import com.example.demo.service.AddressService;

@SpringBootApplication
public class SpringJpaEntityGraphApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	ctx=SpringApplication.run(SpringJpaEntityGraphApplication.class, args);
		AddressService service=ctx.getBean(AddressService.class);
	
		service.task2();
		ctx.close();
		
	}   

	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			
			@Autowired
			AddressRepository repo;
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				
				City chennai=new City(980, "Chennai");
				City madurai=new City(982,"madurai");
						
						User ram =new User(101, "Ram", 43525232L);
						User suresh=new User(102, "suresh", 23423423L);
						
						
						Address address1=new Address(201, "Mr.", madurai, suresh);
						Address address2=new Address(202, "Dr.", chennai, ram);
						
						this.repo.save(address1);
						this.repo.save(address2);
			}
		};
		
	}
}
