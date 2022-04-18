package com.training;

import java.time.*;

public class Student {
	
	private int rollnumber;
	private String studentName;
	private LocalDate dateOfBirth;
	private LocalDateTime dateOfJoining;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int rollnumber, String studentName, LocalDate dateOfBirth, LocalDateTime dateOfJoining) {
		super();
		this.rollnumber = rollnumber;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
	}



	public int getRollnumber() {
		return rollnumber;
	}



	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}



	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}



	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth
				+ ", dateOfJoining=" + dateOfJoining + "]";
	}
	
	
	
	
	
}
