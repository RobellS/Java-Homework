package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Week2hw1DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(Week2hw1DiApplication.class, args);
	
		System.out.println("Springbook application running ...");
	
		Library lib1 = Context.getBean(Library.class);
		Bookstore bkst1 = Context.getBean(Bookstore.class);
	
		Book book1 =Context.getBean(Book.class);
		
		book1.setAuthor("Malcolm Gladwell");
		book1.setTitle("The Tipping Point");
		book1.setYear(2000);
	
		lib1.setBook(book1);
		bkst1.setBook(book1);
		
		lib1.getBook().display();
	}
}
