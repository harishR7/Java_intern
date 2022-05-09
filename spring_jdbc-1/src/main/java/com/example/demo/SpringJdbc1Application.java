package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;
import com.example.demo.ifaces.ProductRespository;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) {
ApplicationContext ctx=SpringApplication.run(SpringJdbc1Application.class, args);
		
		ProductRespository repo=ctx.getBean(ProductRespository.class);
		
		int x=6;
		
		switch (x) {
		case 1:
			// adding a product in add()
			Product tv=ctx.getBean(Product.class);
			System.out.println("row added ="+repo.add(tv));
			break;
		case 2:
			// find all ()
			repo.findAll().forEach(System.out::println);
			break;
		case 3:
			// deleting a product
			System.out.println("Row Deleted="+repo.delete(110));
			break;
		case 4:
			// findById method
			System.out.println(repo.findbyId(890));
			break;	
		case 5:
			// update a row
				Product cable=(Product) ctx.getBean("cable");
				System.out.println("Row updated="+repo.update(cable));
			break;	
		case 6:
			// findbyid using optional
			Optional<Product> optional=repo.findByIdUsingOptional(10567);
			if(optional.isPresent()) {
				System.out.println(optional.get());
			}
			else {
				System.out.println("Invalid id");
			}
		
			break;	
		default:
			break;
		}
	}
		
		
		
		
		
		

		
		
	
@Bean
public Product tv() {
	return new Product(999,"LG tv",50000);
}

@Bean
public Product cable() {
	return new Product(112, "cable", 7000);
}

}
