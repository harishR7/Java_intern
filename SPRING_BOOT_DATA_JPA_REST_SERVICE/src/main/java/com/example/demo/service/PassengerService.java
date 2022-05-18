package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;
import com.example.demo.iface.PassengerRepository;



@Service
public class PassengerService {

	

	
	private PassengerRepository repo;
	
	@Autowired
	public PassengerService(PassengerRepository repo) {
		super();
		this.repo = repo;
	}


	public Passenger add(Passenger pass) {
		return repo.save(pass);
	}
	
	
	public List<Passenger>  findAll(){
		
		return this.repo.findAll();
	}
	
	public List<Passenger> findByDateTime(LocalDateTime datetime){
		return this.repo.findByTripTripDateTime(datetime);
	}
	
	public List<Passenger> findByName(String name){
		return this.repo.findByPassengerName(name);
	
	}
	public void deleteById(int id) {
		
		this.repo.deleteById(id);
			
		}
}
