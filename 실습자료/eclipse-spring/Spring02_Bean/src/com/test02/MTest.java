package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		
		//getBean()통해 bean 확인 후 해당 빈 출력
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Address bean = (Address)factory.getBean("lee");
		System.out.println(bean.toString()); 
		System.out.println(bean); 
		
		Address bean2 = (Address)factory.getBean("hong");
		System.out.println(bean2.toString());
		System.out.println(bean2);
		
		
		
		
		
		
		
		
	}
}
