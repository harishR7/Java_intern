package com.training;

import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.time.*;

public class WorkingWithDifferentDateClasses {

	public static void main(String[] args) {
		
		//Strp 1 Creating UTIL date
		java.util.Date date1=new java.util.Date();
	//	java.sql.Date date2=new java.sql.Date(1234456);
		
		System.out.println(date1);
		System.out.println(date1.getTime());
		
		// Step2 UTIL date to sql Date
		java.sql.Date date2=new java.sql.Date(date1.getTime());
		System.out.println(date2);
		
		
		//Step 3 SQL date to localDate
		LocalDate localDate=date2.toLocalDate();
		
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getMonthValue());
		
		
		//changing sqlDate to localDate
		java.sql.Date sqlDate2=
				java.sql.Date.valueOf(localDate);
		System.out.println("SQL date 2:"+sqlDate2);
		
	}

}
