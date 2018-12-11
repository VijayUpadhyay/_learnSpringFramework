package com.vijay.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloAnnotation {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/xmls/beans.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(HelloWorldConfiguration.class);
		context.refresh();
		
		HelloWorld obj =  context.getBean(HelloWorld.class);
		obj.display();
		System.out.println(context.getAutowireCapableBeanFactory());
	} 
}
