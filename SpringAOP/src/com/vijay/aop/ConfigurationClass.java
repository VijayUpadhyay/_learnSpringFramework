package com.vijay.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ConfigurationClass {
	
	@Bean
	public Test2 Test2(){
		return new Test2();
	}
	@Bean
	public TestAspect testAspect(){
		return new TestAspect();
	}
	
	
	

}
