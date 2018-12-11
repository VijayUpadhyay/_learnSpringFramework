package com.vijay.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireEx {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfiguration.class);
		//context.refresh();
		Address address = (Address) context.getBean("address1");
		Employee emp = context.getBean(Employee.class);
		Company company = context.getBean(Company.class);
		
		address.setCity("abc");
		address.setLandmark("ekya");
		address.setLocality("kundanhalli");
		address.setPostalCode("10010");
		address.setState("karnataka");
		address.setStreetNo(10);
		//emp.setAddress(address);
		
		/*address.setCity("pqr");
		address.setLandmark("tcs");
		address.setLocality("vydehi");
		address.setPostalCode("560037");
		address.setState("karnataka");
		address.setStreetNo(10);*/
		//company.setAddress(address);
		
		System.out.println(company); 
		System.out.println(emp);
	}
	
}
