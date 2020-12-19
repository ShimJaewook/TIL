package com.example.mc.todos.domain;

import java.util.List;
import java.util.stream.Collectors;

import com.example.mc.todos.application.web.dto.TodoDto;
import com.example.mc.todos.store.repository.TodoJpo;
import com.google.gson.Gson;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Todo {
	private Long todoNum;
	private String title;
	private String contents;
	private String startDate;
	private String endDate;
	
	@Builder
	public Todo(Long todoNum, String title, String contents, String startDate, String endDate) {
		this.todoNum = todoNum;
		this.title = title;
		this.contents = contents;
		this.startDate = startDate;
		this.endDate = endDate;		
	}
	
	public void update(String title, String contents, String startDate, String endDate) {
		this.title = title;
		this.contents = contents;
		this.startDate = startDate;
		this.endDate = endDate;		
	}

	public TodoDto toDto() {
		return TodoDto.builder()
				.todoNum(this.todoNum)
				.title(this.title)
				.contents(this.contents)
				.startDate(this.startDate)
				.endDate(this.endDate)
				.build();
	}
	
	public static List<TodoDto> toDtoList(List<Todo> todos){
		return  todos.stream().map(Todo::toDto).collect(Collectors.toList());
	}
	
	@Override
	public String toString() {
		Gson json = new Gson();
		return json.toJson(this);
	}
	
	public static Todo sample() {
		return Todo.builder()
				.todoNum(1L)
				.title("title")
				.contents("contents")
				.startDate("2020-10-01")
				.endDate("2020-10-02")
				.build();
	}
	
	public static void main(String [] args) {
		System.out.println(Todo.sample());
	}
	
}
