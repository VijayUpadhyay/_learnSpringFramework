package com.vijay.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutowireConfiguration {
	
	@Bean
	public Address address1(){// we can comment this bean if required=false for @Autowired
		return new Address();
	}
	
	@Bean
	public Address address2(){// we can comment this bean if required=false for @Autowired
		return new Address();
	}
	
	@Bean 
	public Employee employee(){
		return new Employee(address1());
	}
	
	@Bean 
	public Company company(){
		return new Company();
	}
	

}
