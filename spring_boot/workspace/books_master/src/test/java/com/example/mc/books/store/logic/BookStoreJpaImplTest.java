package com.example.mc.books.store.logic;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mc.books.domain.Book;
import com.example.mc.books.store.repository.BookJpo;
import com.example.mc.books.store.repository.BookStoreJpaRepository;
import com.example.mc.books.store.repository.BookStoreJpaRepositoryCustom;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookStoreJpaImplTest {
	
	@Autowired
	BookStoreJpaRepository bookStore;
	
	@Autowired
	BookStoreJpaRepositoryCustom bookSearch;

	@Before
	public void setUp() {
		//given
		bookStore.save(new BookJpo(Book.sample()));
	}
	
	@After
	public void clean() {
		//then
		bookStore.deleteAll();
	}
	@Test
	public void testRetrieveAll() {
	
		//when
		List<BookJpo> books = bookStore.findAll();
		
	
		Book book = books.get(0).toDomain();
		assertEquals(book.getTitle(), "Spring Microservice in Action");
		
	
	}

	@Test
	public void testRetrieve() {
		Book book = bookStore.findById("9781629398").get().toDomain();
		
		assertEquals(book.getTitle(), "Spring Microservice in Action");
	}

	@Test
	public void testCreate() {
		bookStore.save(new BookJpo(Book.sample()));
	}

	@Test
	public void testUpdate() {
		Book book = bookStore.findById("9781629398").get().toDomain();
		book.setTitle("Spring Boot");
		bookStore.save(new BookJpo(book));
		
		book =  bookStore.findById("9781629398").get().toDomain();
		
		assertEquals(book.getTitle(), "Spring Boot");
	}

	@Test
	public void testDelete() {
		bookStore.deleteById("9781629398");

	}

	@Test
	public void testSearch() {
		List<BookJpo> books = bookSearch.findByQuery("SELECT * FROM books WHERE title like '%Spring%'");
		
		Book book = books.get(0).toDomain();
		assertEquals(book.getTitle(), "Spring Microservice in Action");
		
	}

//	@Test
//	public void testIsExist() {
//		fail("Not yet implemented");
//	}

}
