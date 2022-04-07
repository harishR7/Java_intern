package com.training;

import com.training.model.RangeCheckException;
import java.util.*;
import com.training.model.Student;
import com.training.service.ExceptionHandling;
import com.training.service.StudentService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Student ram = null;
		try {
			ram = new Student(101,"Ramesh",98);
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StudentService service = new StudentService(ram);
		
		System.out.println(service.printDetails());
		
		
		StudentService service2=new StudentService();
		StudentService service3=new StudentService(ram);
			
		try {
			System.out.println(service3.findRank());
		} catch (Exception e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		System.err.println("Name is not passed");
		}
	*/	
		ExceptionHandling exHandling=new ExceptionHandling();
	//	exHandling.usingArrayIndexException(args);
		
	//	exHandling.usingNumberFormatExpection("Fourty Five");
	//	exHandling.usingNumberFormatExpection("45");
	//	exHandling.usingFinallyBlock();
		
		
		
		//System.out.println(exHandling.underStandFinallyBlock());
		
		try {
			System.out.println(exHandling.underStandFinallyBlock());
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// try with resource type
		
		try(Scanner scan=new Scanner(System.in)){
			System.out.println("enter number");
			int num=scan.nextInt();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
