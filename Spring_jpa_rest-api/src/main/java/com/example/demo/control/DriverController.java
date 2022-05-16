package com.example.demo.control;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;

@RestController
@RequestMapping(path = "/api/v1")
public class DriverController {

	

private DriverService service;

public DriverController(DriverService service) {
	super();
	this.service = service;
}

@GetMapping(path="/drivers")
public List<Driver>getAllDriver(){
	return this.service.findAll();
}

@GetMapping(path="/drivers/{id}")
public Driver getDriverById(@PathVariable int id) {
	return this.service.findById(id);
}

//@PostMapping(path ="/drivers")
//public Driver addDriver(@RequestBody Driver entity) {
//	return this.service.addDriver(entity);
//}

 
@PostMapping(path ="/drivers")
public ResponseEntity<Driver> addDriver(@RequestBody Driver entity) {
	Driver driver= this.service.addDriver(entity);
	
	URI location=ServletUriComponentsBuilder
			                   .fromCurrentRequest()// =>http://localhost:8080/api/v1/drivers
			                   .path("/{id}") // http://localhost:8080/api/v1/drivers/id
			                   .buildAndExpand(entity.getDriverId())
			                   .toUri();
//	return ResponseEntity.created(location).body(driver);
	return ResponseEntity.status(HttpStatus.CREATED).body(driver);
}

@DeleteMapping(path="/drivers/{id}")  
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

@DeleteMapping(path = "/drivers")
public ResponseEntity<Object	> remove(@RequestBody Driver entity){
	
	Driver result=this.service.remove(entity);
	if(result!=null) {
		return ResponseEntity.status(204).build();
		
	}
	else {
		return ResponseEntity.ok("No record Matching");
	}
}

}
