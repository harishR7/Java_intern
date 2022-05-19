package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CreditCard;
import com.example.demo.service.CreditCardService;

@RestController
@RequestMapping("/api/v1")
public class CreditCardController {

	
	private CreditCardService service;

	@Autowired
	public CreditCardController(CreditCardService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path = "/creditcards")
	public List<CreditCard> findAll(){
		return this.service.getAll();
	}
	
	@GetMapping(path = "/creditcards/{cardNumber}")
	public CreditCard findById(@PathVariable("cardNumber") long id) {
		return this.service.getById(id);
		
	}
	@PostMapping(path = "/creditcards")
	public ResponseEntity<CreditCard> add(@RequestBody CreditCard entity){
		CreditCard card=this.service.addCard(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(card);
	}
	
	@DeleteMapping(path = "/creditcards")
	public ResponseEntity<Object> delete(@RequestBody CreditCard entity){
		this.service.remove(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body("deleted");
	}
	
}
