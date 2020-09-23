package com.example.mc.todos.store.logic;

import static org.junit.Assert.*;

import java.awt.print.Book;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mc.todos.store.repository.TodoStoreJpaRepository;
import com.example.mc.todos.store.repository.TodoStoreJpaRepositoryCustom;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoStoreJpaImplTest {

	@Autowired
	TodoStoreJpaRepository todoStore;
	
	@Autowired
	TodoStoreJpaRepositoryCustom todoSearch;
	
	@Before
	public void setUp() {
//		todoStore.save(new BookJpo(Book.sample()));
	}
	
	@After
	public void clean() {
		todoStore.deleteAll();
	}
	
	@Test
	public void testDelete() {
		todoStore.deleteById("9781629398");
	}
	

}
