package com.training;

import java.util.HashMap;

public class HashMap2 {
	
	public static void main(String [] arg) {
		
		Student ram=new Student(101, "ram", 78);
		Student shyam=new Student(102, "shyam", 68);
		Student mukesh=new Student(103, "mukesh", 88);
		
		HashMap<Integer,Student>map=new HashMap<>();
		
		map.put(900, ram);
	    map.put(902, shyam);
	    map.put(904,mukesh);
	    System.out.println(map.get(900));
	}

}
