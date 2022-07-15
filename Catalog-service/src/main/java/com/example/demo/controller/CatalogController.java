package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/catalogs")
public class CatalogController {

	
	@GetMapping
	public HashMap<String , String> getDetails(){
		HashMap<String, String> details=new HashMap<>();
		
		details.put("cab", "Rs.20 per Km");
		details.put("auto", "Rs.10 per Km");
		details.put("bus", "Rs.5 per Km");
		
		return details;
	}
}
