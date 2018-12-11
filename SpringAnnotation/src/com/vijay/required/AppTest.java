package com.vijay.required;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigurationClass.class);
		context.refresh();
		
		Address address = context.getBean(Address.class);
		Company company = context.getBean(Company.class);
		
		System.out.println(address);
		System.out.println(company);
		
		System.out.println(address.getStreetNo());

	}

}
