package com.vijay.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigurationClass.class);
		context.refresh();
		
		Test2 aspect = context.getBean(Test2.class);
		aspect.display(5);
		aspect.display(5,6);
		aspect.checkError();
		aspect.afterReturning();
		aspect.around();
		
		context.close();
	}
}
