package com.training;
import java.util.*;
public class HashSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram=new Student(101, "ram", 78);
		Student shyam=new Student(102, "shyam", 68);
		Student magesh=new Student(103, "magesh", 88);
		Student chinnaMagesh=new Student(103, "magesh", 88);
		
		//HashSet<Student> set=new HashSet<>();
		//Set<Student> set=new TreeSet<>();
	Set<Student> set=new HashSet<>();
		
		set.add(chinnaMagesh);
		
		set.add(shyam);
		set.add(magesh);
		set.add(ram);
		
		for(Student eachValue:set) {
		//System.out.println(eachValue);
			System.out.println(eachValue.getFirstName());
		}
		System.out.println(set.size());
		System.out.println(ram);
		
		
		
	}

}
