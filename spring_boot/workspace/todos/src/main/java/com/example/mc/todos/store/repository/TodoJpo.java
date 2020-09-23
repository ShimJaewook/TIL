package com.example.mc.todos.store.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;

import com.example.mc.todos.domain.Todo;

import lombok.Data;

@Entity
@Data
@Table(name="todos")
public class TodoJpo {
	
	@Id
//	@Column(nullable=false, unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY) //사용자로부터 받은 것이 아니라 DB에서 IDENTIFIER가 생성을 해준다.
	private int todoNum;
	@Column(nullable=false)
	private String title;
	private String content;
	@Column(nullable=false)
	private String startDate;
	private String endDate;

	public TodoJpo(Todo todo) {
		super();
		BeanUtils.copyProperties(todo, this);
	}
	
	public Todo toDomain() {
		Todo todo = new Todo();
		BeanUtils.copyProperties(this, todo);
		return todo;
	}
	
	public static List<Todo> toDomains(List<TodoJpo> todoJpos) {
		return todoJpos.stream().map(TodoJpo::toDomain).collect(Collectors.toList());

	}
}
