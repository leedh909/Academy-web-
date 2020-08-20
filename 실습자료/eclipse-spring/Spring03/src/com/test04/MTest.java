package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		
		Developer leess = factory.getBean("leess",Developer.class);
		System.out.println(leess);
		
		Engineer honggd = factory.getBean("honggd",Engineer.class);
		System.out.println(honggd);
		
		
	}

}
