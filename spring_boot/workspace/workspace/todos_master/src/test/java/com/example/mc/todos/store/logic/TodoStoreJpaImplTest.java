package com.example.mc.todos.store.logic;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.mc.todos.domain.Todo;
import com.example.mc.todos.store.repository.TodoJpo;
import com.example.mc.todos.store.repository.TodoStoreJpaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoStoreJpaImplTest {
	
	@Autowired
	TodoStoreJpaRepository todoStore;
	
	@After
	public void clean() {
		todoStore.deleteAll();
	}
	
	@Test
	public void testRetrieveAll() {
		//given
		Todo todo=Todo.sample();
		todoStore.save(TodoJpo.builder()
					.title(todo.getTitle())
					.contents(todo.getContents())
					.startDate(todo.getStartDate())
					.endDate(todo.getEndDate())
					.build());
		
		//when
		List<TodoJpo> todos = todoStore.findAll();
	    System.out.println("select all : "+todos.size()+" : "+todos.get(0));
		//then
		todo = todos.get(0).toDomain();
		assertEquals(todo.getTitle(),"title");
	}
	
	@Test
	public void testRetrieve() {
		//given
		Todo todo=Todo.sample();
		todoStore.save(TodoJpo.builder()
					.title(todo.getTitle())
					.contents(todo.getContents())
					.startDate(todo.getStartDate())
					.endDate(todo.getEndDate())
					.build());
		todo = todoStore.findById(2L).get().toDomain();
		
		assertEquals(todo.getTitle(),"title");
	}
	
	@Test
	public void testCreate() {
		Todo todo=Todo.sample();
		todoStore.save(TodoJpo.builder()
					.title(todo.getTitle())
					.contents(todo.getContents())
					.startDate(todo.getStartDate())
					.endDate(todo.getEndDate())
					.build());
		}
	
	@Test
	public void testDelete() {
		Todo todo=Todo.sample();
		todoStore.save(TodoJpo.builder()
					.title(todo.getTitle())
					.contents(todo.getContents())
					.startDate(todo.getStartDate())
					.endDate(todo.getEndDate())
					.build());
		todoStore.deleteById(4L);
	}
}
