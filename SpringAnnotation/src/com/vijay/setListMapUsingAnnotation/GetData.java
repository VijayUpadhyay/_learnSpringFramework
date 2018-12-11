package com.vijay.setListMapUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetData {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/xmls/collections.xml");
		System.out.println("entered");
		
		Employee emp = (Employee) context.getBean("employee");
		Company company = (Company) context.getBean("company");
		StockMarket stockMarket = (StockMarket) context.getBean("stockMarket");
		//Map<Integer,Company> company1 = new HashMap<>();
		
		///stockMarket.setCompanyMap(company1);
		System.out.println("Employee Details");
		System.out.println(emp);
		
		System.out.println("Company Details");
		System.out.println(company);

		System.out.println("Stock details");
		System.out.println(stockMarket);
	}

}
