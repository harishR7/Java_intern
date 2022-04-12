package com.training;
import java.util.*;
public class HashMapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student(101, "ram", 78);
		Student shyam=new Student(102, "shyam", 68);
		Student mukesh=new Student(103, "mukesh", 88);
		
		HashMap<Integer,Student>map=new HashMap<>();
		
		System.out.println(map.put(900, ram));
		System.out.println(map.put(902, shyam));
	//	System.out.println(map.put(902, mukesh));
		//map.put(900, ram);
	//	map.put(902, shyam);
		
		Student added =map.put(902,mukesh);
		
		if(added!=null) {
			map.put(904, added);
		}
		
		System.out.println(map.get(902));
		System.out.println(map.get(904));
		
	}
	

}
