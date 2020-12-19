package com.example.mc.todos.application.web.dto;

import com.example.mc.todos.domain.Todo;

import lombok.Builder;
import lombok.Getter;

@Getter
public class TodoDto {
	private Long todoNum;
	private String title;
	private String contents;
	private String startDate;
	private String endDate;
	
	@Builder
	public TodoDto(Long todoNum, String title, String contents, String startDate, String endDate) {
		this.todoNum = todoNum;
		this.title = title;
		this.contents = contents;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Todo toEntity() {
		return Todo.builder()
				.todoNum(this.todoNum)
				.title(this.title)
				.contents(this.contents)
				.startDate(this.startDate)
				.endDate(this.endDate)
				.build();
	}
	
	
}
