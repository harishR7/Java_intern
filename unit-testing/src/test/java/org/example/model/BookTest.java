package org.example.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import java.util.Set;
import org.example.service.BookService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BookTest {

	BookService service=null;
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+"Called");
	}
	@BeforeEach
	public void setUp(TestInfo info) {
		
		service=new BookService();
		System.out.println(info.getDisplayName()+"Called");
	}
	
	@Test
	@DisplayName("BookList should not be empty")
	void testGetBookList () {
		BookService service=new BookService();
		Set<Book> list=service.getBookList();
		
		assertNotNull(list);
	}
	
	@Test
	@DisplayName("add MEthod should return 1 for success and 0 for failure to insert")
	void testAddBooks() {
		
		//Book Java=new Book(1001, "Java", 700);
		Book Java=new Book();
		int value=service.addBook(new Book());
		int expected =1;
		assertEquals(expected, value);
	}
	
	@Test
	@DisplayName("addBook Method should not Accept Dupilcate")
	void testDuplicateNotAllowed() {
//		BookService service=new BookService();
//		Book java=new Book(1001, "Java", 700);
//		Book profJav=new Book(1001, "Java", 700);
//		int value=service.addBook(java);
//		 int actual=service.addBook(profJav);
//		 int expected=0;
//		 assertEquals(expected, actual);
//		
		
		assertAll("Testing Add Books",
				()-> assertEquals(1, service.addBook(new Book(1001, "Java", 700))),
				()-> assertEquals(0, service.addBook(new Book(1001, "Java", 700)))
				
				);
	}
	
	@Test
	
	@DisplayName(value = "if the Element is not found in the collection removebook method should throw "
			+ "Runtime Exception with message Element Not Found")
	
	void testRemove() {
		

		//boolean remove=service.removeBook(profJav);
	  Throwable exception=
			assertThrows( RuntimeException.class,()->service.removeBook(new Book(1002, "Python", 800)));
			assertEquals("Element Not Found", exception.getMessage());
			
	}
	
	@ParameterizedTest
	@DisplayName(value = "Test if getBestBook method has the value Head First Java in one first Three position")
	
	@ValueSource(ints = {0,1,2})
	void testCheckingForJava(int indexs) {
		System.out.println(System.getProperty("os.name"));
		assumeTrue(System.getProperty("os.name").equals("Windows 8"));
		assertEquals("Head First Java", service.getBestBooks().get(indexs));
	}
}
