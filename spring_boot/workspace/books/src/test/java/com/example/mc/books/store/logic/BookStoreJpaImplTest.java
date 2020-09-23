package com.example.demo.books.store.logic;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.books.domain.Book;
import com.example.demo.books.store.repository.BookJpo;
import com.example.demo.books.store.repository.BookStoreJpaRepository;
import com.example.demo.books.store.repository.BookStoreJpaRepositoryCustom;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookStoreJpaimplTest {

   @Autowired
   BookStoreJpaRepository bookStore;

   @Autowired
   BookStoreJpaRepositoryCustom bookSearch;

//   @Before
//   public void setUp() {
//      bookStore.save(new BookJpo(Book.sample()));
//   }
//
//   @After
//   public void clean() {
//      bookStore.deleteAll();
//   }

   @Test
   //@Ignore
   public void testRetrieveAll() {

      // when
      List<BookJpo> books = bookStore.findAll();

      // then
      Book book = books.get(0).toDomain();
      assertEquals(book.getTitle(), "Spring Microservice in action");

   }

   @Test //@Ignore
   public void testRetrieve() {
      Book book = bookStore.findById("9781629398").get().toDomain();
      assertEquals(book.getTitle(), "Spring Microservice in action");
      
   }

   @Test
   //@Ignore
   public void testCreate() {
      bookStore.save(new BookJpo(Book.sample()));
   }

   @Test
   //@Ignore
   public void testUpdate() {
      
      Book book = bookStore.findById("9781629398").get().toDomain();
      book.setTitle("custom");
      bookStore.save(new BookJpo(book));
      
      book = bookStore.findById("9781629398").get().toDomain();
      
      assertEquals(book.getTitle(), "custom");
   }

   @Test
   //@Ignore
   public void testDelete() {
      //null 인지 체크
      bookStore.deleteById("9781629398");
      
   }

   @Test
   //@Ignore
   public void testSearch() {
      List<BookJpo> books = bookSearch.findByQuery("SELECT * FROM books WHERE title like '%Spring%'");
      Book book = books.get(0).toDomain();
      assertEquals(book.getTitle(), "Spring Microservice in action");
   }

   @Test
   @Ignore
   public void testIsExist() {
      fail("Not yet implemented");
   }

}