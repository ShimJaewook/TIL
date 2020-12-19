package com.example.mc.todos.domain.service.logic;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mc.todos.domain.Todo;
import com.example.mc.todos.domain.service.TodoService;
import com.example.mc.todos.store.TodoStore;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {
	
//	@Autowired
//	TodoStore store;
	private final TodoStore store;
  
	@Override
	public void todoCreate(Todo todo) {
		store.insert(todo);
	}

	@Override
	public Todo todoDetail(long todoNum) throws NoSuchElementException {
		return store.findTodo(todoNum);
	}

	@Override
	public List<Todo> todoList() throws NoSuchElementException {
		return store.findAll();
	}

	@Override
	public void todoModify(Todo todo) throws NoSuchElementException {
		store.update(todo);

	}

	@Override
	public void todoDelete(int todoNum) throws NoSuchElementException {
		store.delete(todoNum);

	}

}
