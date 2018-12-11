package com.vijay.initializingAndDisposableBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTestForBeans {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(TestConfig.class);
		context.refresh();
		
		//TestBeans beans = context.getBean(TestBeans.class);
		InitAndDestroyMethod beanCheck = context.getBean(InitAndDestroyMethod.class);
		context.close();
	}
}
