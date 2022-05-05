package com.example.resourses;

import java.util.List;

import com.example.model.Student;
import com.example.service.StudentService;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/student")
public class StudentResourse {

	private static StudentService service=new StudentService();
	
	
    public StudentResourse() {
		// TODO Auto-generated constructor stub
    	super();
    	
	}
    
   
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {
		
		return service.getAll();
	}
	
	/*
	@GET
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student findById(@PathParam("rollNumber") int id) {
		return service.findById(id).orElseThrow(()-> new RuntimeException("Id NotFound"));
	}*/
	//using response
	@GET
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("rollNumber") int id) {
		try {
			Student entity=service.findById(id).orElseThrow(()-> new RuntimeException("Id NotFound"));
			return Response.ok(entity).build();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//return Response.status(400,e.getMessage()).build();
			//using json message--------------->
		JsonObject obj=Json.createObjectBuilder().add("Id Not Founbd", "").build();
		return Response.ok(obj).status(400).build();
			//return Response.ok("Id not found").status(400).build();
		}
	}
	
	/* @DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean remove(@PathParam("rollNumber")int id) {
		return service.remove(id);
	}
	*/
	// using response
	@DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remove(@PathParam("rollNumber")int id) {
		boolean result=service.remove(id);
		if(result) {
			//return Response.status(204).build();
			return Response.ok("One resourse Deleted").build();
		}
		else {
			return Response.status(400,"Not Deleted").build();
		}
	}
	/*@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Student add(Student student) {
		boolean result =service.add(student);
		
		if(result) {
		return student;
		}
		else {
			return null;
		}
		
	}
	*/
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response add(Student student) {
		boolean result =service.add(student);
		
		if(result) {
		return Response.ok(student).status(201).build();
		}
		else {
			return Response.status(400,"not Created").build();
		}
		
	}
	
	@PUT
	@Path("/{rollnumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student update(@PathParam("rollnumber")int id ,Student student) {
		return service.update(id, student);
	}
	
	
	
	
	
}
