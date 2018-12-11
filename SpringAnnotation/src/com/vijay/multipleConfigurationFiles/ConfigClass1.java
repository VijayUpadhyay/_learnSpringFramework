package com.vijay.multipleConfigurationFiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass1 {

	@Bean(name={"test1","test2","test3"})
	public Bean1 beanTest(){
		return new Bean1();
	}
	
}
