package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(SpringSecurityApplication.class, args);
	
		BCryptPasswordEncoder encoder = 
				ctx.getBean(BCryptPasswordEncoder.class);
	
		System.out.println(encoder.encode("India"));
		System.out.println(encoder.encode("Nepal"));
	}
@Bean
public BCryptPasswordEncoder secure() {
	return new BCryptPasswordEncoder();
}
}
