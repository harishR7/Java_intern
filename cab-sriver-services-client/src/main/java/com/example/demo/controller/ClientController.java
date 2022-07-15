package com.example.demo.controller;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.CabDriver;
import com.example.demo.entity.TripDTO;
import com.example.demo.entity.TripDetail;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private TripDTO dto;
	
	@GetMapping(path = "/drivers")
	public String getDrivers() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",String.class);
	}
	
	@GetMapping(path = "/trips/json")
	public TripDetail[] getTrips() {
		return this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/tripdetails",TripDetail[].class);
	}
	@GetMapping(path = "/drivers/json")
	public CabDriver[] getDriversAsJson() {
		return this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers",CabDriver[].class);
	}
	
	@GetMapping(path = "/drivers/trips/{id}")
	public String getDriverTrips(@PathVariable("id") int id ) {
		String driver=this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,String.class);
		String trip= this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/tripdetails/driverid/"+id,String.class);
	    return driver+trip;
	}
	
	@GetMapping(path = "/drivers/trips/json/{id}")
	public TripDTO getDriverTripJson(@PathVariable("id") int id) {
		CabDriver driver=this.template.getForObject("http://CAB-DRIVER-SERVICE/api/v1/drivers/"+id,CabDriver.class);
		TripDetail[] trip= this.template.getForObject("http://TRIP-DETAIL-SERVICE/api/v1/tripdetails/driverid/"+id,TripDetail[].class);
		dto.setDriver(driver);
		Set<TripDetail> found=Arrays.stream(trip).collect(Collectors.toSet());
		dto.setTripdetails(found);
		
		return dto;
	}
}
