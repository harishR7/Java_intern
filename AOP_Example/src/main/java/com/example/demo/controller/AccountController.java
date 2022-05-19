package com.example.demo.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AccountService;



@RestController
@RequestMapping("/api/v1")
public class AccountController {
	
	private AccountService service;

	Logger log =  Logger.getAnonymousLogger();
	
	@Autowired
	public AccountController(AccountService service) {
		super();
		
		this.service = service;
	}
	
	
	@GetMapping(path = "/accounts")
	public List<String> getAccounts(){
		
		return this.service.getAccounts();
	}
	
}
