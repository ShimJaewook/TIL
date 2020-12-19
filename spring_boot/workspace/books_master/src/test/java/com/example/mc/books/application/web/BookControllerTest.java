package com.example.mc.books.application.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.mc.books.domain.service.BookService;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers=BookController.class)
public class BookControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private BookService service;
	
	@Test
	public void testBookList() throws Exception {
		mvc.perform(get("/"))
		.andExpect(status().isOk())
		.andDo(log());
	}

}
