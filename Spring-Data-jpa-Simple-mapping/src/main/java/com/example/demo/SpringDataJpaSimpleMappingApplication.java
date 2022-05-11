package com.example.demo;

import org.aspectj.apache.bcel.generic.SwitchBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepository;
import com.example.demo.service.DoctorService;



@SpringBootApplication
public class SpringDataJpaSimpleMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx=SpringApplication.run(SpringDataJpaSimpleMappingApplication.class, args);
		
		Doctor siva=ctx.getBean("yuvan",Doctor.class);
		
		DoctorService service=ctx.getBean(DoctorService.class);
		
		
		
		
//		
		int x=6;
		switch(x) {
		
		case 1:
			// findall
			service.findAll().forEach(System.out::println);
			break;
		case 2:
			
			// findBy dept
			service.findByDept("cardiologysis").forEach(System.out::println);
			break;
		case 3:
			// add a doctor
			Doctor added=service.add(siva);
			
			if(added!=null) {
				System.out.println("One Doctor Added");
			}
			break;
		case 4:
			// findbydoctorName
			System.out.println(service.findByDoctorName("Yuvan"));
			break;
		case 5:
			//find by doctorname and department
	         service.findByDoctorNameAndDepartment("Maddy", "physiotherapy").forEach(System.out::println);
	         break;
		case 6:
			//find by doctorname and department using @query with sql statement
			service.getByNameDept("Venkat","physiotherapy").forEach(System.out::println);
			break;
			}
				
			
		
		ctx.close();
	}
	
	
		
	@Bean
	public Doctor siva() {
		return new Doctor(101, "Lokesh", "cardiologysis", 9842342424L);
	}
	@Bean
	public Doctor mad() {
		return new Doctor(102, "Maddy", "physiotherapy", 8435433435L);
	}
	@Bean
	public Doctor venkat() {
		return new Doctor(103, "Venkat", "cardiologysis", 9635123233L);
	}
	@Bean
	public Doctor praveen() {
		return new Doctor(104, "Praveen", "Dentalist", 8234242234L);
	}
	@Bean
	public Doctor yuvan() {
		return new Doctor(105, "Yuvan", "Drug dealer", 865723121L);
	}
}
