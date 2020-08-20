package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Developer hong = factory.getBean("hong",Developer.class);
		System.out.println(hong);
		
		Engineer lee = factory.getBean("lee",Engineer.class);
		System.out.println(lee);
		
		
		
		
	}
}
