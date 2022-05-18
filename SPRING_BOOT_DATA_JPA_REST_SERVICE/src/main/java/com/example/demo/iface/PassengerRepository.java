package com.example.demo.iface;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

		//@Query(name = "from Passenger where passenger_name=:pasname")
//	public Passenger findByPassengerName(@Param("passname") String name);
	 List<Passenger> findByPassengerName(String name);
	
	//@Query(name = "from TripHistory where tripDateTime=:tripdate")
	//public TripHistory findByTripDateTime(@Param("tripedate") LocalDateTime date);
	 List<Passenger> findByTripTripDateTime(LocalDateTime date);
}
