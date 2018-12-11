package com.vijay.initializingAndDisposableBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

	/*@Bean
	public TestBeans testBeans(){
		return new TestBeans();
	}*/
	
	@Bean(initMethod="initMethod",destroyMethod="destroyMethod")
	public InitAndDestroyMethod beanCheck(){
		return new InitAndDestroyMethod();
	}
	
	
}
