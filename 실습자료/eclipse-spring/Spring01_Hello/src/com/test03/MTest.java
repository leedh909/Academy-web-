package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		//1. FileSystemResource + BeanFactory
		//2. ClassPathResource + BeanFactory
		//	 Resource res = ClassPathResource("com/test03/beans.xml");
		//	 BeanFactory = new XmlBeanFactory(res);
		
		//3.
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/beans.xml");
		//ApplicationContext : beanfactory 상속, 빈팩도리와 유사한 기능을 제공하지만 좀 더 다양한 기능을 제공한다.
		//ClassPathXmlApplicationContext : 해당 위치의 xml파일에서 정의 내용을 읽는다.
		
		MessageBean bean = (MessageBean)factory.getBean("korean");
		bean.sayHello("스프링");
		
		bean = (MessageBean)factory.getBean("english");
		bean.sayHello("Spring");
		
	}
	
	//getBean으로 써야 레이지로딩(=게으른 호출) 
	
	
	
	
}
