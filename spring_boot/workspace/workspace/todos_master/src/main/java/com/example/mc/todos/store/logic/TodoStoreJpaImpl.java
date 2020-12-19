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
		repository.save(TodoJpo.builder()
								.title(todo.getTitle())
								.contents(todo.getContents())
								.startDate(todo.getStartDate())
								.endDate(todo.getEndDate())
								.build());
		
	}

	@Override
	public void delete(long todoNum) throws NoSuchElementException {
		repository.deleteById(todoNum);
	}

	@Override
	public void update(Todo todo) throws NoSuchElementException {
		repository.save(TodoJpo.builder()
								.todoNum(todo.getTodoNum())
								.title(todo.getTitle())
								.contents(todo.getContents())
								.startDate(todo.getStartDate())
								.endDate(todo.getEndDate())
								.build());
	}

	@Override
	public Todo findTodo(long todoNum) throws NoSuchElementException {
		Optional<TodoJpo> todoJpo = repository.findById(todoNum);
		return todoJpo.map(TodoJpo::toDomain).get();
	}

	@Override
	public List<Todo> findAll() throws NoSuchElementException {
		List<TodoJpo> todos = repository.findAll();
		return TodoJpo.toDomains(todos);
	}


}
