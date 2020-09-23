package com.example.mc.todos.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo {
	
	@Id
	private int todoNum;
	private String title;
	private String content;
	private String startDate;
	private String endDate;
	
   @Override
   public String toString() {
      Gson json = new Gson();
      return json.toJson(this);
   }
   
   public static Todo getSampleTodo() {
      Todo todo = new Todo(1,"테스트 타이틀","안녕하세요 컨텐츠 입니다.","2020-11-23","2020-11-23");
      return todo;
   }
   
}
