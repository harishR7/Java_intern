package com.training.service;

import com.training.model.Student;

public class StudentService {
	private Student student;

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentService(Student student) {
		super();
		this.student = student;
	}
	//appling the handle rule of exception handling
	public String printDetails() {
		String name=null;
		try {
			name= this.student.getFirstname();
			System.out.println(24/0);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.err.println("Student Object is not passed check again");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Value cannot be divided by zero");
		}
		return name;
		
	}
	// appling the declare rule of exception handling
	public String findRank()throws Exception{
		String grade="A";
		if(this.student.getMarkScored()>90) {
			grade="O";
		}
		return grade;
		
	}
}
