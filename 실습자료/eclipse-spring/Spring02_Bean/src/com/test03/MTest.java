package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext test = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Address lee = (Address)test.getBean("lee");
		System.out.println(lee);
		
		
		
		
	}
	
	
}
