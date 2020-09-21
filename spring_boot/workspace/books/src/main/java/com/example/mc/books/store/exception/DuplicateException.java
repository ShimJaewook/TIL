package com.example.mc.books.store.exception;

public class DuplicateException extends Exception {

	public DuplicateException() {
		super("already exist");
	}
	
	public DuplicateException(String message) {
		super(message + " already ");
	}
}
