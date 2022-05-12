package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Seminar;
import com.example.demo.entity.Speaker;
import com.example.demo.util.SeminarUtil;


@SpringBootApplication
public class SpringDataJpsOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDataJpsOneToOneApplication.class, args);
		SeminarUtil util=ctx.getBean(SeminarUtil.class);
		
		
		
		int x=1;
		switch(x) {
		
		case 1:
			// findall
			util.findAll();
			break;
		case 2:
			// add values
			util.create();
			break;
	}
	}
@Bean
public Speaker sonic() {
	return new Speaker(101, "Sonic", "Five");
}
	@Bean
	public Seminar auditorium() {
		Seminar semi=new Seminar();
		semi.setId(201);
		semi.setName("English");
		semi.setDuration(54);
		return semi;
		
	}
	
}
