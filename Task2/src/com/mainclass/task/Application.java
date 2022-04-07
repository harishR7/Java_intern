package com.mainclass.task;

import com.customer.task.Customer;
import com.employee.Salary.EmployeeService;
import com.employee.task.Employee;
import com.hotel.task.Hotel;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer harish=new Customer("Harish",9840123449L,"male","chennai");
		
		Employee rahul=new Employee("Rahul",100,50000,"Developer");
		
		Hotel taj=new Hotel("taj Taj",984012345,5000);
		
		//Customer details 
		System.out.println("Customer details:");
		System.out.println(harish.getCusName());
		System.out.println(harish.getCusNo());
		System.out.println(harish.getCusGender());
		System.out.println(harish.getCusPlace());
		
		System.out.println();
		
		// Employee details
		System.out.println("Employee Details:");
		System.out.println(rahul.getEmpName());
		System.out.println(rahul.getEmpId());
		System.out.println(rahul.getEmpSalary());
		System.out.println(rahul.getEmpPosition());
		
		System.out.println();
		
		//taj details
		System.out.println("taj details:");
		System.out.println(taj.getHotelName());
		System.out.println(taj.getHotelNum());
		System.out.println(taj.getHotelAmount());
		//using Scanner
		
		
		System.out.println();
		
		EmployeeService bonus=new EmployeeService();
	      System.out.println("emp bonus "+bonus.calculateBonus(rahul));
	      
	      System.out.println();
		
		Customer ramesh=new Customer();
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
	      ramesh.setCusName(name);
	      System.out.println("Customer Name is:"+ramesh.getCusName());
	      
	      scan.close();
	      
	      
	      
	      
	       
		
	}

}
