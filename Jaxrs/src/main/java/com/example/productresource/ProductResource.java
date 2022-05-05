package com.example.productresource;

import java.util.List;
import java.util.Optional;

import com.example.dao.ProductService;
import com.example.entity.Product;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;;

@Path("/product")
public class ProductResource {
	
	private static ProductService service=new ProductService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> findAll(){
		return service.findAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id")int id) {
		try {
			Product pro=service.findbyId(id).orElseThrow(()-> new RuntimeException("id not present"));
			return Response.ok(pro).status(201).build();
		} catch (Exception e) {
			// TODO: handle exception
			return Response.status(400,e.getMessage()).build();
		}
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response add(Product entity) {
		try{
			service.addproduct(entity);
			return Response.ok(entity).status(201).build();
			
		}
		catch (Exception e) {
			return Response.status(400,"Invalid attribute").build();
			// TODO: handle exception
		}
		
		
			
		}
	
	@DELETE
	@Path("/srch/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("id") int id ){
		
			
		/*try {
			service.deleteById(id) ;
			return Response.ok("one resource is deleted").build();
		}
		catch (Exception e) {
			// TODO: handle exception
			return Response.status(400,"not deleted").build();
		}
		*/
		int num=service.deleteById(id) ;
		if(num!=0) {
			return Response.ok("one resource is deleted").build();
		}
		else {
			return Response.status(400,"not deleted").build();
		}

	}
	
	@PUT
	@Path("/srch/{Name}/{price}")
	@Produces(MediaType.APPLICATION_JSON)
	public  Response update(@PathParam("Name")String productName,@PathParam("price")double newPrice ) {
		
		/*
		try {
			service.updatepriceByName(productName, newPrice);
			return Response.ok("one row updated").status(201).build();
		}
		catch (Exception e) {
			// TODO: handle exception
			return Response.ok("Not updated").status(400).build();
		}
		*/
		int num=service.updatepriceByName(productName, newPrice);
		if(num!=0) {
			return Response.ok("one row updated").status(201).build();
		}
		else {
			return Response.ok("Not updated").status(400).build();
		}
	}
	
}

