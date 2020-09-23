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

	@Id
	private String ISBN;
	private String title;
	private String author;
	private String publichser;
	private double price;
	private String imgUrl;
	private String introduce;
	
	
	@Override
	public String toString() {
		Gson json = new Gson();
		return json.toJson(this);
	}
	
	
	
//	public Book() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//
//	public Book(String iSBN, String title, String author, String publichser, double price, String imgUrl,
//			String introduce) {
//		super();
//		ISBN = iSBN;
//		this.title = title;
//		this.author = author;
//		this.publichser = publichser;
//		this.price = price;
//		this.imgUrl = imgUrl;
//		this.introduce = introduce;
//	}



	public String getISBN() {
		return ISBN;
	}



	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getPublichser() {
		return publichser;
	}



	public void setPublichser(String publichser) {
		this.publichser = publichser;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getImgUrl() {
		return imgUrl;
	}



	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}



	public String getIntroduce() {
		return introduce;
	}



	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}



	public static Book sample() {
		return new Book("978162938", 
				"Spring Microservice inAction",
				"John Carnell",
				"Manning",
				59.92,
				"book_images/spring.jpg",
				"Spring Boot and Spring Cloud offer java Developers an easy");
	}
	
}
