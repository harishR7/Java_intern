package com.testing.model;

import com.testing.Employee;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee data=new Employee();
		data.setEmpName("harish");
		data.setRollNumber(56);
		data.setEmpId(1);
		
		System.out.println(data.getEmpName());
		System.out.println(data.getRollNumber());
		
		System.out.println(data.getEmpId());
		
	}

}
