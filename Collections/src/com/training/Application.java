package com.training;

import java.util.List;

import com.training.iface.CrudRepository;
import com.training.service.BookService;



public class Application {
	
	public static void print( List<Book>book) { //Collection<Book> can also  can be used because its a super class
		for(Book eachvalue: book) {
			System.out.println(eachvalue);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Book java=new Book(101, "Java", "suba", 450);
		Book spring=new Book(102, "Spring", "Mad", 650);
		Book maven=new Book(103, "maven", "Harish", 450);
		Book html=new Book(104, "html", "Loki", 450);
		Book python=new Book(105, "Python", "Dhanush", 450);
		
		CrudRepository service=new BookService();
		
		service.add(java);
		service.add(spring);
		service.add(maven);
		service.add(html);
		service.add(python);
		
		
		
		List<Book> bookList=service.findAll();
		for(Book eachBook : bookList) {
			System.out.println(eachBook);
		}
		System.out.println(service.findbyId(105));
		
		
		// remove a element using remove() method
		service.remove(python);
		
		// printing the size of the List<book> using size() method
		
		System.out.println(service.findAll().size());
		
		
		
		System.out.println("================================================================");
//		List<Book> bookList1=service.findAll();
//		for(Book eachBook : bookList1) {
//			System.out.println(eachBook);
//		}
		System.out.println("find all");
		print(service.findAll());
		
		
		Book react=new Book(106, "React", "Rahul", 9000);
		// else part execute
		service.update(react);
		
		print(service.findAll());
		
		
		// if part execute
		service.update(react);
		print(service.findAll());
		
		
		
		
		Book reactNew= new Book(106,"React","Rahul",12000);
		service.update(react,reactNew);
		System.out.println("=======================================");
		print(service.findAll());
		
	}
	
	  

}
