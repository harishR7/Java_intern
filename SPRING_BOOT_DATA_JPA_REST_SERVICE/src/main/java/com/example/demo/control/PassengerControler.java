package com.example.demo.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PassengerService;

@RestController
@RequestMapping("/con")
public class PassengerControler {

	
	private PassengerService service;

	public PassengerControler(PassengerService service) {
		super();
		this.service = service;
	}
	
	
}
