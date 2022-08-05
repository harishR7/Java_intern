package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {

	
	@Test
	@DisplayName(value = "Test the Get Message return a string of Length 8 character")
	void testMaxLength() {
		
		
		Greeting grtObj=new Greeting();
		
		int actual=grtObj.getMessage().length();
		int expected=5;
		
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName(value = "Test the Birthday wish method does not return null")
	void testBirthdayWish() {
		Greeting grtObj=new Greeting();
		String actual=grtObj.birthdayWish("ramesh");
		assertNotNull(actual);
	

	}
	
	@Test
	@DisplayName("test birthday wish should return Happy birthday with user name suffixed")
	void testBWWithSuffixs() {
		Greeting grtObj=new Greeting();
		String name="punniya";
		String actual =grtObj.birthdayWish( name);
		String expected="Happy Birthday "+name;
		assertEquals(expected, actual);
		
	}
	


	
}
