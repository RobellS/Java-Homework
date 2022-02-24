package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Library {

	private String lname;
	private int lage;
	private String llocation;
	@Autowired
	private Book book;
	


public Library() {
	
}
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getLage() {
		return lage;
	}
	public void setLage(int lage) {
		this.lage = lage;
	}
	public String getLlocation() {
		return llocation;
	}
	public void setLlocation(String llocation) {
		this.llocation = llocation;
	}
	public Book getBook() {
		return book;
	}
	@Autowired
	public void setBook(Book book) {
		this.book = book;
	}

	
}
