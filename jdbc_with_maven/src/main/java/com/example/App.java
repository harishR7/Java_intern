package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.dao.MemberResposiory;
import com.example.dao.ProductService;
import com.example.entity.Invoice;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void member() {
		Connection con;
		
//		con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");
		//MemberResposiory res=new MemberResposiory(con);
		
		con=ConnectionFactory.getOracleConnection();
		MemberResposiory res=new MemberResposiory(con);
		ProductService service=new ProductService(con);
		
		
		Product cable=new Product(112, "cable", 1000);
		Product switches=new Product(113, "switch", 2000);
	//	service.usingtxn(cable, switches);
		
		Product specs=new Product(116, "specs", 2500);
		Invoice invoice= new Invoice(126, "Venkat", 5, 113 );
		
		service.usingtxnWithCatchException(specs, invoice);
		
	//System.out.println(	res.remove(100));
	/*	Member mem=new Member(107, "Praveen", "sipcot", LocalDate.of(22, 7, 11), "Annual", 345, 5, 432);
	System.out.println(res.add(mem));*/
	//	System.out.println(res.findById(101));
	//	res.findAll().forEach(System.out::println);
		

	}
	public static void product() {
		Connection con;
    	con=ConnectionFactory.getPostgressConnection();
    	
		ProductService service=new ProductService(con);
    //	Product toAdd=new Product(102, "Loki", 7000);
    //	System.out.println(service.addproduct(toAdd));
		
		Product kathli=new Product(110, "yovel", 5444);
    	
	}
    public static void main( String[] args )
    {
    	
    	member();
		
		
}
}
