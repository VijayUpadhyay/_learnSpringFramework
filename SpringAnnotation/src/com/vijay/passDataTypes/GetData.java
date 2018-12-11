package com.vijay.passDataTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetData {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/xmls/dataTypes.xml");
		System.out.println("entered");
		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
		Company company = (Company) context.getBean("company");
		System.out.println(company);
		
		System.out.println("ConstructorCheck 1");
		ConstructorCheck check1 = (ConstructorCheck) context.getBean("check1");
		System.out.println(check1);
		
		System.out.println("ConstructorCheck 2");
		ConstructorCheck check2 = (ConstructorCheck) context.getBean("check2");
		System.out.println(check2);

	}

}
