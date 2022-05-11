package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "harish_employee1")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@Column(name = "employee_id")
	int employeeId;
	@Column(name = "employee_name")
	String employeeName;
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	@Column(name = "date_of_birth")
	LocalDate dateOfBirth;
	@Column(name = "location")
	String location;
	@Column(name = "skillset")
	String skillset;
	@Column(name = "phone_number")
	long phoneNumber;
	
	
	
}
