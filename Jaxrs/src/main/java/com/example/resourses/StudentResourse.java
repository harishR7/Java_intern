package com.example.resourses;

import java.util.List;
import java.util.Optional;

import com.example.model.Student;
import com.example.service.StudentService;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

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
	
	@GET
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student findById(@PathParam("rollNumber") int id) {
		return service.findById(id).orElseThrow(()-> new RuntimeException("Id NotFound"));
	}
	
	@DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean remove(@PathParam("rollNumber")int id) {
		return service.remove(id);
	}
	
	@POST
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
	
	
	
	
	
	
}
