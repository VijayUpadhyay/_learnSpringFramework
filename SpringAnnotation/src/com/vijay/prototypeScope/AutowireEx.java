package com.vijay.prototypeScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireEx {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfiguration.class);
		//context.refresh();
		Address address1 = (Address) context.getBean(Address.class);
		Address address2 = (Address) context.getBean(Address.class);
		Employee emp = context.getBean(Employee.class);
		Company company = context.getBean(Company.class);
		
		address1.setCity("abc");
		address1.setLandmark("ekya");
		address1.setLocality("kundanhalli");
		address1.setPostalCode("10010");
		address1.setState("karnataka");
		address1.setStreetNo(10);
		emp.setAddress(address1);
		
		address2.setCity("pqr");
		address2.setLandmark("tcs");
		address2.setLocality("vydehi");
		address2.setPostalCode("560037");
		address2.setState("karnataka");
		address2.setStreetNo(10);
		company.setAddress(address2);
		
		System.out.println(company); 
		System.out.println(emp);
	}
	
}
