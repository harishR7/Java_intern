package com.example.demo.enitity.bidirection;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


	
	@Entity
	@Table(name="harish_doctor_onetomany")

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@FieldDefaults(level = AccessLevel.PRIVATE)
	public class Doctor {
		
		@Id
		@Column(name = "doctor_id")
		
		int doctorId;
		
		
		@Column(name = "doctor_name")
		String doctorName;
		
		
		@Column(name = "department")
		String department;
		
		
		@Column(name = "phone_number")
		long phoneNumber;
		
	@OneToMany(targetEntity = Patient.class,fetch= FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "doctor")
	
	List<Patient> patientlist;	
	}

