package com.training;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		
		Student ram=new Student(101, "Ram", 
				LocalDate.of(2000, 11, 16), 
				LocalDateTime.of(2010, Month.JUNE, 5, 9, 30));
		
		
		Student shyam=new Student(102, "Shyam", 
				LocalDate.now(), 
				LocalDateTime.now());
		
		
		
		System.out.println("Rams Year of Birth:"
				            +ram.getDateOfBirth().getYear());
		
		
		
		System.out.println("Rams Year of Birth:"
	            +ram.getDateOfBirth().plus(1,ChronoUnit.YEARS));
		
		
		
		System.out.println("Shyam Year of Birth:"
				+shyam.getDateOfBirth().getYear());
		
		
		System.out.println("Shyam Sixtyth Year of Birth:"
				+shyam.getDateOfBirth().plus(60,ChronoUnit.YEARS));
		
		
		
		System.out.println("Shyam Sixtyth Year of Birth:"
				+shyam.getDateOfBirth().minus(3,ChronoUnit.MONTHS));
	}

}
