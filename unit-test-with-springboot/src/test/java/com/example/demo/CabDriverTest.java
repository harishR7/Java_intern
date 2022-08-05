package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.Matchers.hasSize;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.MediaSize.ISO;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureMockMvc
public class CabDriverTest {

	
	@Autowired
	MockMvc mock;
	
	@Autowired
	ObjectMapper mapper;
	
	@MockBean
	CabDriverService service;
	
	private CabDriver canna;
	private CabDriver damu;
	private CabDriver david;
	
	@BeforeAll
	void init() {
	 canna=new CabDriver(1010, "Kanna", 8745, "Chennai", LocalDate.of(1997, 10, 11), 4.5);
		 damu=new CabDriver(1011, "Damu", 8723, "Madurai", LocalDate.of(1997, 9, 11), 4.5);
		 david=new CabDriver(1010, "David", 8743, "Madurai", LocalDate.of(1998, 12, 19), 4.5);
	}
	@DisplayName("Test find All method return a array")
	@Test
	void testFindAll() throws Exception {
		List<CabDriver> list = new ArrayList<>();
		list.add(canna);
		list.add(damu);
		list.add(david);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		given(service.findAll()).willReturn(list);
		
		mock.perform(MockMvcRequestBuilders
                .get("/api/v1/drivers")
               .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[2].driverName", is("David")));
	}
	
	@Test
	@DisplayName("Test Add Method return status code 201 and return the element Added")
	void testAdd() throws Exception{
		
		CabDriver np = new CabDriver(605, "Np", 9876541234L, "Madurai", 
				LocalDate.of(1998, 10, 12), 4.8);
		
		given(service.save(np)).willReturn(np);
		 
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers")
	               .contentType(MediaType.APPLICATION_JSON)
	               .content(asJsonString(np)))
	     		   .andExpect(status().isCreated())
	     		   .andExpect(content().contentType(MediaType.APPLICATION_JSON))
	     		   .andExpect(jsonPath("$.driverName", is("Np")));   
	}

	private static String asJsonString(CabDriver np) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.writeValueAsString(np);
			} catch(Exception e) {
			throw new RuntimeException(e);
			}
	}
}
