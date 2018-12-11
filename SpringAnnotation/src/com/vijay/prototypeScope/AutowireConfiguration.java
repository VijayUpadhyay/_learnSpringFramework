package com.vijay.prototypeScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AutowireConfiguration {
	
	@Bean
	@Scope("prototype")
	public Address address(){// we can comment this bean if required=false for @Autowired
		return new Address();
	}
	
	@Bean 
	public Employee employee(){
		return new Employee(address());
	}
	
	@Bean 
	public Company company(){
		return new Company();
	}
	

}
