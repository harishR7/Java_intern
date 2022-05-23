package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.DriverDTO;

@RestController
@RequestMapping(path = "/api/v1")
public class ClientController {

	
	
	@Autowired
	RestTemplate template;
	
	@GetMapping(path = "/client/drivers")
//	public String getDriver() {
//		return template.getForObject("http://MICROSERVICE-1/api/v1/drivers", String.class);
//	}
	
	public DriverDTO[] getDrivers() {
		return template.getForObject("http://MICROSERVICE-1/api/v1/drivers", DriverDTO[].class);
	}
}
