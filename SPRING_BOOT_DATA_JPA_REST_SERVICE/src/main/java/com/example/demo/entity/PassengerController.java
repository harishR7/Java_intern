package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PassengerService;



@RestController
@RequestMapping(path = "/api/v1")
public class PassengerController {
	
	
	private PassengerService service;
	@Autowired
	public PassengerController(PassengerService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path = "/passengers")
	public List<Passenger> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping(path = "/passengers/")
	public ResponseEntity<Passenger> add(@RequestBody Passenger entity) {
		Passenger pass= this.service.add(entity);
		
		return ResponseEntity.ok(pass);
		
	}
	
	@GetMapping("passengers/date/{date}")
	
	public List<Passenger> findByDate(@PathVariable("date")@DateTimeFormat(iso =ISO.DATE_TIME) LocalDateTime dateTime){
		return this.service.findByDateTime(dateTime);
	}
	
	@GetMapping("passengers/name/{name}")
	public List<Passenger> findByName(@PathVariable("name")String name){
		return this.service.findByName(name);
	}
	@DeleteMapping(path="/passengers/{id}")  
	public ResponseEntity<String> deleteById(@PathVariable int id){
		
		try {
		this.service.deleteById(id);
		//return ResponseEntity.status(204).build();
		return ResponseEntity.status(HttpStatus.CREATED).body("One Record Deleted "+id);
		}
		catch(Exception e){
			return ResponseEntity.status(404).build();
		}
		
	}
	
	
}
