package com.training.model;

import java.util.*;
import java.util.Map;
import java.util.Set;

import com.training.Patient;

public class Appoitment {
	private Map<Doctor,Set<Patient>> list;
	

	public Appoitment() {
		super();
		// TODO Auto-generated constructor stub
		list=new HashMap<>();
	}


	public Appoitment(Map<Doctor, Set<Patient>> list) {
		super();
		this.list = list;
	}


	public Map<Doctor, Set<Patient>> getList() {
		return list;
	}


	public void setList(Map<Doctor, Set<Patient>> list) {
		this.list = list;
	}


	public Set<Patient> getPatients(Doctor key){
		return this.list.get(key)
;
	}	
	
	
}
