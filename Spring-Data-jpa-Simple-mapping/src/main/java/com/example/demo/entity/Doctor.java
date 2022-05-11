package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;



@Entity
@Table(name="harish_doctor")

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
}
