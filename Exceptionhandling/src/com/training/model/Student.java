package com.training.model;

public class Student {
	private int rollNumber;
	private String firstname;
	private double markScored;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		if(markScored<0) {
			try {
				throw new RangeCheckException("Mark should be positive integer[0-100]");
			} catch (RangeCheckException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
		this.markScored = markScored;
		}
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(int rollNumber, String firstname, double markScored) throws RangeCheckException {
		super();
		if(markScored<0) {
			throw new RangeCheckException("Mark should be positive integer[0-100]");
		}else {
		this.rollNumber = rollNumber;
		this.firstname = firstname;
		this.markScored = markScored;
		}
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstname=" + firstname + ", markScored=" + markScored + "]";
	}
	
	
	
	
}
