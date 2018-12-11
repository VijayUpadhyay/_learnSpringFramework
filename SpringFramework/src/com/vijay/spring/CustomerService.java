package com.vijay.spring;

public class CustomerService {
	private String name;
	
	public void returnName(){
		System.out.println("My name is " +name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
