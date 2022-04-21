package com.training;

import java.io.File;

import com.training.services.BookService;

public class AppForStream {

	public static void main(String[] args) {
		
BookService service=new BookService();
		
		File file=new File("book.ser");
		int ch=3;
		if(ch==1) {
		
		Book book=new Book(1000,"React","Robert",8546);
		
		
		boolean result=service.writeToStream(file,book);
		
		if(result) {
			System.out.println("One Record Serialized");
		}
		
	}
		else {
			Book fromFile=(Book) service.readToStream(file);
			
					System.out.println(fromFile);
					
		}

	}
	}
