package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Bookstore {

	private String bname;
	private int bage;
	private String blocation;
	@Autowired
	private Book book;



public Bookstore() {
	
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public int getBage() {
	return bage;
}
public void setBage(int bage) {
	this.bage = bage;
}
public String getBlocation() {
	return blocation;
}
public void setBlocation(String blocation) {
	this.blocation = blocation;
	}
public Book getBook() {
	return book;
}
@Autowired
public void setBook(Book book) {
	this.book = book;
}
}
