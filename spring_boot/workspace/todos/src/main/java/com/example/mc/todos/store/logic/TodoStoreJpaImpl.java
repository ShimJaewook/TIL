package com.example.mc.todos.store.logic;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mc.todos.domain.Todo;
import com.example.mc.todos.store.TodoStore;
import com.example.mc.todos.store.repository.TodoJpo;
import com.example.mc.todos.store.repository.TodoStoreJpaRepository;

@Repository
public class TodoStoreJpaImpl implements TodoStore {

	@Autowired
	TodoStoreJpaRepository repository;
	
	@Override
	public void insert(Todo todo) {
		// TODO Auto-generated method stub
		repository.save(new TodoJpo(todo));
	}

	@Override
	public void delete(int todoNum) throws NoSuchElementException {
		// TODO Auto-generated method stub
		repository.deleteById(todoNum);
	}

	//@Override
	public List<Todo> search(String keyword, String searchType) {
		String query = "";
		
		return null;
	}
	
	@Override
	public void update(Todo todo) throws NoSuchElementException {
		// TODO Auto-generated method stub
		repository.save(new TodoJpo(todo));
	}

	@Override
	public Todo findTodo(int todo) throws NoSuchElementException {
		// TODO Auto-generated method stub
		Optional<TodoJpo> todoJpo = repository.findById(todo);
		return todoJpo.map(TodoJpo::toDomain).get();
	}

	@Override
	public List<Todo> findAll() throws NoSuchElementException {
		List<TodoJpo> todos = repository.findAll();
//		return todos.stream().map(TodoJpo::toDomain).collect(Collectors.toList());
		return TodoJpo.toDomains(todos);
	}

}
