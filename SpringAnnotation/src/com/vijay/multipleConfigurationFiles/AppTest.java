package com.vijay.multipleConfigurationFiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ConfigClass2.class,ConfigClass1.class);
		context.refresh();
		//ConfigClass1 is the latest class loaded loaded by spring container so its bean creation will work even if 2 beans with same name is there.
		Bean1 b2 = (Bean1) context.getBean("test2");
		System.out.println(b2);
		
		Bean2 b1 = (Bean2) context.getBean("test1");
		System.out.println(b1);
		Bean1 b3 = (Bean1) context.getBean("test3");
		
		System.out.println(b3);
		
	}
}
