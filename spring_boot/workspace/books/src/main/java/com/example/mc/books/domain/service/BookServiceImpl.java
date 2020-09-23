package com.example.mc.books.domain.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.mc.books.domain.Book;
import com.example.mc.books.store.BookStore;
import com.example.mc.books.store.exception.DuplicateException;

public class BookServiceImpl implements BookService {

	@Autowired
	private BookStore bookStore;
	
	@Override
	public List<Book> bookList() throws NoSuchElementException{
		// TODO Auto-generated method stub
		List<Book> books = bookStore.retrieveAll();
		return books;
	}

	@Override
	public void bookModify(Book book) throws NoSuchElementException {
		// TODO Auto-generated method stub

	}

	@Override
	public void bookCreate(Book book) throws DuplicateException {
		// TODO Auto-generated method stub
		bookStore.create(book);
	}

	@Override
	public Book bookDetail(String ISBN) throws NoSuchElementException {
		// TODO Auto-generated method stub
		return bookStore.retrieve(ISBN);
	}

	@Override
	public void bookDelete(String ISBN) throws NoSuchElementException {
		bookStore.delete(ISBN);
	}

	@Override
	public List<Book> search(String keyword, String searchType) throws NoSuchElementException {
		return bookStore.search(keyword, searchType);
	}

}
