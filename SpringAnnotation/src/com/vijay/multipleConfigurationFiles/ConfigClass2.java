package com.vijay.multipleConfigurationFiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass2 {
	
	@Bean(name={"test1","test2","test3"})
	public Bean2 bean2() {
		return new Bean2();
	}
}
