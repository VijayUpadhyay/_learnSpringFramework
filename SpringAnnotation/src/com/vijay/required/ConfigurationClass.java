package com.vijay.required;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ConfigurationClass {
	
	@Bean
	public Company company(){
		return new Company();
	}
	
	@Bean
	public Address address(){
		return new Address();
	}
	
	@Bean
	public RequiredAnnotationBeanPostProcessor postProcessor(){
		return new RequiredAnnotationBeanPostProcessor();
	}
}
