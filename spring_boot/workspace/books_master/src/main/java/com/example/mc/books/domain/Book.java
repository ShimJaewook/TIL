package com.example.mc.books.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book{
	
	private String ISBN;
	private String title;
	private String author;
	private String publisher;
	private double price;
	private String imgUrl;
	private String introduce;
	
	
	@Override
	public String toString() {
		Gson json = new Gson();
		return json.toJson(this);
	}
	
	public static Book sample() {
		return new Book("9781629398", 
				"Spring Microservice in Action",
				"John Carnell",
				"Manning",
				59.92,
				"book_images/spring.jpg",
				"Spring Boot and Spring Cloud offer Java Developers an easy");	
	}
	
	public static void main(String [] args) {
		System.out.println(Book.sample());
	}
}
