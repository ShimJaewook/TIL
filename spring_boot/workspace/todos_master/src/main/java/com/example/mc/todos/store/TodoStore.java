package com.example.mc.todos.store;

import java.util.List;
import java.util.NoSuchElementException;

import com.example.mc.todos.domain.Todo;

public interface TodoStore {
	
	public abstract void insert(Todo todo); //todoNum : db sequence
	public abstract void delete(long todoNum) throws NoSuchElementException;
	public abstract void update(Todo todo) throws NoSuchElementException;
	public abstract Todo findTodo(long todoNum) throws NoSuchElementException;
	public abstract List<Todo> findAll() throws NoSuchElementException; 
}
