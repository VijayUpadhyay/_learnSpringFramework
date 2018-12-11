package com.vijay.test;

import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {

	private String message;

	public String getMessage() {
		return message;
	}

	@Value(value="My First Annotated Bean")
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void display() {
		System.out.println(message);
		
	}
	
}
