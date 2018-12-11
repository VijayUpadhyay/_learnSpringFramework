package com.vijay.mkyong.springTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AreaImpl {

	public static void main(String[] args) {
	
		ApplicationContext obj = new ClassPathXmlApplicationContext("applicationContext.xml");
		Area objArea = (Area) obj.getBean("semiCircleBean");
		
		float result = objArea.draw(2.8f);

		System.out.println("The area is: "+result);
	}

}
