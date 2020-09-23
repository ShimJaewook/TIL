package com.example.mc.todos.store;

public class DublicateException extends Exception {
	
	public DublicateException() {
		super("already exist");
	}
	
	public DublicateException(String message) {
		super(message + " already ");
	}
}
