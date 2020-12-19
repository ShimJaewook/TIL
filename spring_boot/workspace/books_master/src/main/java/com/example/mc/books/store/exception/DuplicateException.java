package com.example.mc.books.store.exception;

public class DuplicateException extends RuntimeException {
	public DuplicateException() {
		super("already exist");
	}
	
	public DuplicateException(String message) {
		super(message+" already exist");
	}

}
