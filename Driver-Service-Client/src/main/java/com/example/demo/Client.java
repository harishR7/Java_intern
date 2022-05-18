package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Driver;

@Component
public class Client {
	
	String BASEURL="http://localhost:8080/api/v1/drivers";
	private RestTemplate template;
	
	@Autowired
	public Client (RestTemplate template) {
		super();
		this.template=template;
	}
	
	public String invokeGet() {
		return template.getForObject(BASEURL, String.class);
	}
	public Driver[] invokeGetAllAsObject() {
		return template.getForObject(BASEURL, Driver[].class);
	}
	
	public void invokeDelete() {
		template.delete("http://localhost:8080/api/v1/drivers/102"+"Deleted");
	}
	
	public void add() {
		HttpHeaders header=new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HashMap<String,Object>map=new HashMap<>();
		
		
		map.put("driverId",1020);
		map.put("driverName", "Siva");
		map.put("phoneNumber", 435546);
		map.put("rate", 4.3);
		
		HttpEntity<Map<String,Object>>entity= new HttpEntity(map,header);
		
		ResponseEntity<Driver>resp =this.template.postForEntity(BASEURL, entity, Driver.class);
		
		System.out.println("Status Code:="+resp.getStatusCodeValue());
		System.out.println("Body:="+resp.getBody());
		System.out.println("Location: "+resp.getHeaders().getLocation());
	}
	
}
