package com.example.demo;

import org.aopalliance.intercept.Interceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Driver;

@SpringBootApplication
public class DriverServiceClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DriverServiceClientApplication.class, args);
		
		Client client=ctx.getBean(Client.class);
		System.out.println(client.invokeGet());
		
//		Driver[]list=client.invokeGetAllAsObject();
//		for(Driver eachDriver:list) {
//			System.out.println("DriverName:"+eachDriver.getDriverName());
//			System.out.println("Mobile Number:"+eachDriver.getPhoneNumber());
//			System.out.println("Rating:"+eachDriver.getRate());
//		}
		//client.add();
		
		ctx.close();
	}
//	@Bean
//	public RestTemplate template() {
//		return new RestTemplate();
//	}

	@Bean
	public RestTemplate template() {
		
		RestTemplate template=new RestTemplate();
		template.getInterceptors().add(interceptor());
		return template;
	}
	@Bean
	public BasicAuthenticationInterceptor interceptor() {
		return new BasicAuthenticationInterceptor("india", "India");
	}
}
