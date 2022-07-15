package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.TripDetail;
import com.example.demo.repo.TripDetailRespository;

@Service
public class TripDetailService {

	
	@Autowired
	private TripDetailRespository repo;
	
	
	public List<TripDetail> findAll(){
		return this.repo.findAll();
	}
	
	
	public TripDetail save(TripDetail entity) {
		return this.repo.save(entity);
	}
	
	public Optional<TripDetail> findById(int tripId) {
		return this.repo.findById(tripId);
	}
	
	
	public List<TripDetail> findByDriverId(int driverId) {
		return this.repo.findByDriverId(driverId);
	}
}
