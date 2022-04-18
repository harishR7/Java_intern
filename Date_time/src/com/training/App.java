package com.training;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		
		String dateOfBirth="1999-08-10";
		Student vicky=new Student();
		
		vicky.setRollnumber(200);
		vicky.setStudentName("Vignesh");
		vicky.setDateOfBirth(LocalDate.parse(dateOfBirth));
		vicky.setDateOfJoining(LocalDateTime.now());
	
	
		
		System.out.println("Year:"+vicky.getDateOfBirth().getYear());
	//	System.out.println("Month:"+vicky.getDateOfBirth().getDayOfMonth());
		System.out.println("Month:"+vicky.getDateOfBirth().getMonth());
		System.out.println("Day:"+vicky.getDateOfBirth().getMonthValue());
		
		
		
		LocalTime startTime=  LocalTime.of(9,30);		
		
		LocalTime endTime=startTime.plus(8,ChronoUnit.HOURS);
		//LocalTime endTime=startTime.plusHours(8);
		System.out.println("Start time:"+startTime);
		System.out.println("End Time:"+endTime);
		
	}

}
