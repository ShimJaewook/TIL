package com.example.mc.books.store;

import java.util.List;
import java.util.NoSuchElementException;

import com.example.mc.books.domain.Book;
import com.example.mc.books.store.exception.DuplicateException;

public interface BookStore {
	public abstract List<Book> retrieveAll() throws NoSuchElementException;
	public abstract Book retrieve(String ISBN) throws NoSuchElementException;
	public abstract void create(Book book) throws DuplicateException;
	public abstract void update(Book book) throws NoSuchElementException;
	public abstract void delete(String ISBN) throws NoSuchElementException;
	public abstract List<Book> search(String keyword, String searchType) throws NoSuchElementException;
	public abstract boolean isExist(String ISBN);

}
