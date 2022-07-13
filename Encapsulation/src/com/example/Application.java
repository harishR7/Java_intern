package com.example;

import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student();
		// public method able to access
		ram.setRollNumber(45);
		// unable to access because application is a NOT a subclass of student
	//	ram.setMarkScored(89);
		//default method unable to access=>
		//because student class is in com.example.model package
		// and application is in com.example package
	//	ram.setFirstName("Ram");
		// unable to access because the method is private in student
	//	ram.setBranch("Be");
		
		
	//	System.out.print("Roll Number= "+ram.getRollNumber());
	//	System.out.print("Mark Scored="+ram.getMarkScored());
	//	System.out.print("Student Name="+ram.getFirstName());
		
		Student deeps=new Student();
		Student shyam =new Student(43,"ramn",76,"mech");                                                                                 
		//System.out.println("Student Name="+shyam.getFirstName());
		
		
		
		
	//	Student raven=new Student(998,"Sudha","texttile");
	//	System.out.print("Roll Number= "+raven.getRollNumber());
			
		//	System.out.print("Student Name="+raven.getFirstName());
	//		
			
			//System.out.println(deeps.toString());
	}//

}
