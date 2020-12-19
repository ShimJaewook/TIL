package com.example.mc.books.domain.service;

import java.util.List;
import java.util.NoSuchElementException;

import com.example.mc.books.domain.Book;
import com.example.mc.books.store.exception.DuplicateException;

//public abstract method, public final static variable로 구성 
public interface BookService {
	public abstract List<Book> bookList() throws NoSuchElementException;
	public abstract Book bookDetail(String ISBN) throws NoSuchElementException;
	public abstract void bookCreate(Book book) throws DuplicateException;
	public abstract void bookModify(Book book) throws NoSuchElementException;
	public abstract void bookDelete(String ISBN) throws NoSuchElementException;
	public abstract List<Book> search(String keyword, String searchType)throws NoSuchElementException;
}
