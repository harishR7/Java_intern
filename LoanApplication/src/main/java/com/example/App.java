package com.example;

import java.sql.Connection;

import com.example.Connection.ConnectFactory;
import com.example.customer.Customer;
import com.example.loan.LoanApplication;
import com.example.loan.LoanService;

/**
 * Hello world!
 *
 */


public class App 

{
	public static void loanResult() {
		Connection con= ConnectFactory.connetSqlDatabase();
		
		LoanService service=new LoanService(con);
		//System.out.println(service.findById(103));
		Customer cus=new Customer(507, "Praveen", 435243546, 500);
		LoanApplication loan=new LoanApplication(2349, cus, 555);
		//System.out.println(service.add(loan));*/
		System.out.println("/////////////////////////////////////////////");
		//removing a row
		//System.out.println("RowRemoved="+service.remove(2003));
		System.out.println("/////////////////////////////////////////////");
		System.out.println("rowupdated="+service.update(2001, loan));
		System.out.println("/////////////////////////////////////////////");
		// printing all rows
		service.findAll().forEach(System.out::println);
		System.out.println("/////////////////////////////////////////////");
		
	}
    public static void main( String[] args )
    {
        loanResult();
    }
}
