package com.training;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
	    System.out.println(map.get(902));
	    System.out.println(map.get(904));
	    
	    
	    Set<Integer> keys=map.keySet();
	   // System.out.println(keys);
	    for(Integer key:keys) {
	
	    	System.out.println(map.get(key));
	    }
	    System.out.println("printing only value");
	    Collection<Student>list=map.values();
	    for(Student eachStudent:list) {
	    	System.out.println(eachStudent);
	    }
	    
	    System.out.println("Both key and value");
	    Set<Map.Entry<Integer, Student>>list1=map.entrySet();
	    for(Map.Entry<Integer, Student> map1:list1) {
	    	System.out.println(map1.getKey());
	    	System.out.println(map1.getValue());
	    }
	    
	    
	    
	}

}
