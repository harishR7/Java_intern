package com.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("myresourse")
public class MyResourse {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		
		return "Hi";
	}
}
