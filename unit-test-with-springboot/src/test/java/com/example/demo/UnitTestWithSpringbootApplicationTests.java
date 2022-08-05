package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class UnitTestWithSpringbootApplicationTests {
	
	
	@Autowired
	CabDriverService service;

	@BeforeAll
	void setUp() {
		CabDriver driver = new CabDriver(601, "Parveen", 8976543678L, "Chennai", 
				LocalDate.of(1997, 10, 11), 4.5);
		service.save(driver);
	}
	@Test
	@DisplayName("Find All Method should return a empty Array")
	void testFindAllFailure() {
		assertTrue(service.findAll().isEmpty());
	}
	
	@Test
	@DisplayName("Find All Method should return a  Array")
	void testFindAllSuccess() {
		assertFalse(service.findAll().isEmpty());
	}
	
	@Test
	@DisplayName("Find By id Method should return an Element with given id")
	void testFindById() { 
		CabDriver driver = service.findById(601).orElseThrow(EntityNotFoundException::new);
		
		assertEquals("Parveen", driver.getDriverName());
		//assertEquals("Parveen",service.findById(601).get().getDriverName() );
	}
	
	

}
