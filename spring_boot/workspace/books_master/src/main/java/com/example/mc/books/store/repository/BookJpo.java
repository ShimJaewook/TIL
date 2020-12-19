package com.example.mc.books.store.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;

import com.example.mc.books.domain.Book;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="books")
public class BookJpo {
	
	@Id
	@Column(nullable=false, unique=true)
	private String ISBN;
	private String title;
	private String author;
	private String publisher;
	private double price;
	private String imgUrl;  //img_url
	private String introduce;
	
	public BookJpo(Book book) {
		super();
		BeanUtils.copyProperties(book, this);
	}

	public BookJpo() {
		super();
	}
	
	public Book toDomain() {
		Book book = new Book();
		BeanUtils.copyProperties(this, book);
		return book;
	}
	
	public static List<Book> toDomains(List<BookJpo> bookJpos){
		return bookJpos.stream().map(BookJpo::toDomain).collect(Collectors.toList());
	}

}
