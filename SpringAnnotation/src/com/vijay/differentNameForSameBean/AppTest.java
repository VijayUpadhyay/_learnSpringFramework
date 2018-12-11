package com.vijay.differentNameForSameBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigClass.class);
		context.refresh();
		
		Bean1 b1 = (Bean1) context.getBean("test1");
		Bean1 b2 = (Bean1) context.getBean("test2");
		Bean1 b3 = (Bean1) context.getBean("test3");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}
}
