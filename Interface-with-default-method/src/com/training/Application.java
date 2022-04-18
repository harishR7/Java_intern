package com.training;

import com.training.StudentService.StudentService;
import com.training.ifaces.Conditional;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentService service= new StudentService();
		
		System.out.println("Is pass="+service.test(90.0));
		System.out.println("Is fail="+service.negate(90.0));
		System.out.println("Is fail="+service.negate(40.0));
		
		System.out.println(Conditional.getmessage());
	}

}
