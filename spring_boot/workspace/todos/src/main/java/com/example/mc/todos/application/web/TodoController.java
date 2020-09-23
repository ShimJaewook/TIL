package com.example.mc.todos.application.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mc.todos.domain.Todo;
import com.example.mc.todos.domain.service.TodoService;

@RestController
@RequestMapping("/api/todos/")
public class TodoController {

	@Autowired
	private TodoService service;
	
	@PostMapping()
	public void todoCreate(@RequestBody Todo todo) {
		service.todoCreate(todo);
	}
	
	@GetMapping("{todoNum}")
	public Todo todoDetail(@PathVariable int todoNum) {
		return service.todoDetail(todoNum); 
	}
	
	@GetMapping()
	public List<Todo> todoList() {
		return service.todoList();
	}
	
	@PutMapping()
	public void todoModify(@RequestBody Todo todo) {
		service.todoModify(todo);
	}
	
	@DeleteMapping("{todoNum}")
	public void todoDelete(@PathVariable int todoNum) {
		service.todoDelete(todoNum);
	}
}
