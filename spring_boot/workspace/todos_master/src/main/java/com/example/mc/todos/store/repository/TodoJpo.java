package com.example.mc.todos.store.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;

import com.example.mc.todos.domain.Todo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="TODO_SEQ_GEN", //시퀀스 제너레이터 이름
        sequenceName="todo_seq", //시퀀스 이름
        initialValue=1, //시작값
        allocationSize=1//메모리를 통해 할당할 범위 사이즈-default:50
        )
@Table(name="todos")
public class TodoJpo {
	@Id
	@GeneratedValue(
            strategy=GenerationType.SEQUENCE, //사용할 전략을 시퀀스로  선택
            generator="TODO_SEQ_GEN" //식별자 생성기를 설정해놓은  TODO_SEQ_GEN으로 설정        
            )
	private Long todoNum;
	@Column(nullable=false)
	private String title;
	private String contents;
	@Column(nullable=false)
	private String startDate;
	private String endDate;
	
	@Builder
	public TodoJpo(Long todoNum, String title, String contents, String startDate, String endDate){
	    	this.todoNum=todoNum;
		    this.title =title;
	        this.contents=contents;
	        this.startDate=startDate;
	        this.endDate=endDate;
	}
	
	public Todo toDomain() {
		Todo todo = Todo.builder()
				.todoNum(this.todoNum)
				.title(this.title)
				.contents(this.contents)
				.startDate(this.startDate)
				.endDate(this.endDate)
				.build();
		//BeanUtils.copyProperties(this, todo);
		return todo;
	}
	
	public static List<Todo> toDomains(List<TodoJpo> todoJpos){
		return  todoJpos.stream().map(TodoJpo::toDomain).collect(Collectors.toList());
	}
	
}




