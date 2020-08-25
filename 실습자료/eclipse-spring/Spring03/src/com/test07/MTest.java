package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test07/applicationContext.xml");
		
		System.out.println("Spring Bean Container 생성");
		
		TV lg = factory.getBean("lg",TV.class);
		lg.tvon();
		lg.volup();
		lg.voldown();
		lg.tvoff();
		
		TV sam = factory.getBean("samsung",TV.class);
		sam.tvon();
		sam.volup();
		sam.voldown();
		sam.tvoff();
		
	}

}
