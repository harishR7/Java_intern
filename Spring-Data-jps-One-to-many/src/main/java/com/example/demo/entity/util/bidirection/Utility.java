package com.example.demo.entity.util.bidirection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.enitity.bidirection.Doctor;
import com.example.demo.enitity.bidirection.Patient;
import com.example.demo.iFace.bidirection.DoctorRespository;
import com.example.demo.iFace.bidirection.PatientRespository;





@Component
public class Utility {
	
	@Autowired
	List<Patient> patientList;
	
	@Autowired
	Doctor doc;
	
	@Autowired
	DoctorRespository doctorRepo;
	
	@Autowired
	PatientRespository patientRepo;
	
	public void create() {
		doc.setPatientlist(patientList);
		
		Doctor added= doctorRepo.save(doc);
		if(added!=null) {
			System.out.println("One record is added");
		}
		
	}
	
	public List<Doctor> findAll() {
		return doctorRepo.findAll();
	}
	
	public void findAllBySpec() {
		List<Doctor> doctor=doctorRepo.findAll();
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
	public void findDoctorFromPatient() {
		Patient entity= patientRepo.findById(200).get();
		System.out.println(entity.getPatientName());
		System.out.println(entity.getMobileNumber());
	}
}
