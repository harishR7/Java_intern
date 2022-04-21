package com.training;

import java.io.File;

import com.training.services.BookService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book java=new Book(102," Java","Alb",890);
		BookService service=new BookService();
		
		//boolean result=service.writeToFile(new File("Books.txt"), java);
		//if(result) {
		//	System.out.println("One Record Address to file");
		//}
		
		service.readFromFile(new File("Books.txt"))
		                  .forEach(System.out::println);
	}

}
