package com.vijay.differentNameForSameBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

	@Bean(name={"test1","test2","test3"})
	public Bean1 beanTest(){
		return new Bean1();
	}
	
}
