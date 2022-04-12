package com.training.model1;

import com.training.Patient;
import com.training.model.Appoitment;
import com.training.model.Doctor;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient loki=new Patient(101, "Loki","Chennai", 982342423L) ;
		Patient rahul=new Patient(102, "Rahuk","avadi", 53543435L) ;
		Patient mugesh=new Patient(103, "mugesh","Chennai", 982342423L) ;
		
		Set<Patient> set=new HashSet<>();
		  set.add(loki);
		  set.add(rahul);
		  set.add(mugesh);
		  
		  Patient venkat=new Patient(54, "venkat","Chennai", 98423L) ;
			Patient kavin=new Patient(564, "kavin","avadi", 53543435L) ;
			Patient praveen=new Patient(438, "praveen","Chennai", 982342423L) ;
		  
		Set<Patient> patient1=new HashSet<>();
		patient1.add(venkat);
		patient1.add(kavin);
		patient1.add(praveen);
		
		
		Doctor doctor=new Doctor(500, "Ramesh", "Mbbs", set);
		Doctor doctor1=new Doctor (501,"Lochan","Mbbs",set);
		
		Set<Doctor> set1=new HashSet<>();
		set1.add(doctor);
		set1.add(doctor1);
		
		for(Doctor eachSet:set1) {
			//System.out.println(eachSet.getPatients());
		}
		
		Map<Doctor, Set<Patient>> list=new HashMap<>();
		list.put(doctor, set);
		list.put(doctor1, patient1);
		
		Appoitment appoint =new Appoitment(list);
		
		System.out.println(appoint.getPatients(doctor1));
		
		
		
	}

}
