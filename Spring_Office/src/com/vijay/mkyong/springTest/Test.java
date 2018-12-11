package com.vijay.mkyong.springTest;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  


public class Test {

	
	public static void main(String[] args) {
		
		 Resource resource=new ClassPathResource("applicationContext.xml");  
		    @SuppressWarnings("deprecation")
			BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    Student student=(Student)factory.getBean("studentBean");  
		    student.displayInfo(); 
		    
		    Employee emp = (Employee)factory.getBean("employeeBean");
		    emp.display();
		    
		    Parent parent = (Parent)factory.getBean("parent1Bean");
		    parent.display1();
		
		   /* System.out.println(student);*/
	}
	
	
	
}
