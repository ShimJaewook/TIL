package com.example.mc.demo.books.application.web;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mc.books.domain.Book;
import com.example.mc.books.domain.service.BookService;
import com.example.mc.books.store.exception.DuplicateException;

@RestController
@RequestMapping("/api/books/")
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping()
	public List<Book> bookList() {
//		List<Book> books = new ArrayList<Book> ();
//		try {
//			books = service.bookList();
//		} catch(NoSuchElementException notFoundError) {
//			//
//		} 
//		return books;
		System.out.println("controller");
		return service.bookList();
	}
	
	// 입력값 조작해서 - Filter, InterceptorFilter 사용
	@GetMapping("{ISBN}")
	public Book bookDetail(@PathVariable String ISBN) {
		return service.bookDetail(ISBN);
	}
	
	@GetMapping("{searchType}/{keyword}")
	public List<Book> bookSearch(@PathVariable String searchType, @PathVariable String keyword) {
		return service.search(keyword, searchType);
	}
	
	@PostMapping()
	public void bookCreate(@RequestBody Book book) throws DuplicateException { // ExceptionHandler 작성
		service.bookCreate(book);
	}
	
	@PutMapping()
	public void bookModify(@RequestBody Book book) {
		service.bookModify(book);
	}
	
	@DeleteMapping("{ISBN}")
	public void bookDelete(@PathVariable String ISBN) {
		service.bookDelete(ISBN);
	}
}
