package com.trainin.example;
import java.sql.*;
import java.util.Optional;

import com.example.demo.service.ProductService;
import com.example.entity.Product;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
			ProductService service=new ProductService(con);
			
			
		//	Product toAdd=new Product(945, "UPS", 986.5); 
		//	int rowAdded=service.addproduct(toAdd);
			
			//System.out.println("Row Added="+rowAdded);
			
		
			
			
		//	System.out.println(service.deleteById(102));
			
			
			
			Optional<Product> found=service.findbyId(945);
			
			if(found.isPresent()) {
				System.out.println(found.get());
			}
			else {
				System.out.println("product with the given id is not present");
			}
			
			
			System.out.println(service.updatepriceByName("Computer", 8000));
			
			//service.findAll().forEach(System.out::println);
			
			
			
			
			
			
		}
		
		
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
