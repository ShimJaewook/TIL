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
@Entity
public class Book {
	// 식별자가 있으면 Entity, 없으면 VO(Value Object)
	@Id
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
		return new Book("9781617293986","Spring Microservices in Action", "John Carnell", "Manning", 59.92, "book_images/spring.jpg", "Spring Boot and Spring Cloud offer Java developers an easy");
	}
	
	public static void main(String[] args) {
		System.out.println(Book.sample());
	}

}
