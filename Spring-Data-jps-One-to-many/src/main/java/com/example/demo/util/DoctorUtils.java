package com.example.demo.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.DoctorRepository;
import com.example.demo.entity.Patient;

@Component
public class DoctorUtils {
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRepository repo;
	
	public void create() {
		doc.setPatientlist(patientList);
		
		Doctor added= repo.save(doc);
		if(added!=null) {
			System.out.println("One record is added");
		}
		
	}
	
	public List<Doctor> findAll() {
		return repo.findAll();
	}
	
	public void findAllBySpec() {
		List<Doctor> doctor=repo.findAll();
		for(Doctor eachvalue : doctor) {
			System.out.println("DoctorName:"+eachvalue.getDoctorName());
			System.out.println("DoctorDept:"+eachvalue.getDepartment());
					
		List<Patient> patient=eachvalue.getPatientlist();
		for(Patient eachpatient: patient) {
			System.out.println("PatientName="+eachpatient.getPatientName());
			System.out.println("patientNumber="+eachpatient.getMobileNumber());
		}
		}
	}
}
