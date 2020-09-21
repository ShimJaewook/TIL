package com.example.mc.books.store.logic;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mc.books.domain.Book;
import com.example.mc.books.store.BookStore;
import com.example.mc.books.store.exception.DuplicateException;
import com.example.mc.books.store.repository.BookJpo;
import com.example.mc.books.store.repository.BookStoreJpaRepository;

@Repository
public class BookStoreJpaImpl implements BookStore {

	@Autowired
	BookStoreJpaRepository bookStore;
	
	
	@Override
	public List<Book> retrieveAll() throws NoSuchElementException{
		List<BookJpo> books = bookStore.findAll();
		if(books.isEmpty()) throw new NoSuchElementException("books empty");
		return BookJpo.toDomains(books);
	}
	
	@Override
	public void create(Book book) throws DuplicateException {
		if(isExist(book.getISBN())) throw new DuplicateException(book.getISBN());
		bookStore.save(new BookJpo(book));
		
	}

	@Override
	public void update(Book book) throws NoSuchElementException {
		// TODO Auto-generated method stub
		if(!isExist(book.getISBN()) ) throw new NoSuchElementException(book.getISBN());
	}

	@Override
	public void delete(String ISBN) throws NoSuchElementException{
		if(!isExist(ISBN)) throw new NoSuchElementException(ISBN);
		bookStore.deleteById(ISBN);
	}

	@Override
	public List<Book> search(String keyword, String searchType) {
		
		return null;
	}



	@Override
	public Book retrieve(String ISBN) throws NoSuchElementException{
		Optional<BookJpo> book = bookStore.findById(ISBN);
		
		if(book == null ) throw new NoSuchElementException(ISBN+ " book not exist");
		return book.map(BookJpo::toDomain).get();
	}
	
	@Override
	public boolean isExist(String ISBN) {
		Optional<BookJpo> book = bookStore.findById(ISBN);
		if( book == null ) return false;
		return true;
	}

	
}
