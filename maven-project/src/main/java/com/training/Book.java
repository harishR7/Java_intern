package com.training;

public class Book {
	private String authorName;
	private String bookName;
	private int bookNumber;
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String authorName, String bookName, int bookNumber) {
		super();
		this.authorName = authorName;
		this.bookName = bookName;
		this.bookNumber = bookNumber;
	}
	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", bookName=" + bookName + ", bookNumber=" + bookNumber + "]";
	} 
	
	
	
	
	
}
