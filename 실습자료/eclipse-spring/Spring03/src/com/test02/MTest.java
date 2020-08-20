package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		//bean 2개 생성
		// 이순신, 2000000 - id는 lee, 생성자로 초기화
		// 홍길동, 2500000 - id는 hong, setter를 이용해 초기화
		
		//메인에서 getBean으로 bean 출력
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Emp lee = factory.getBean("lee",Emp.class);
		System.out.println(lee);
		
		
		Emp hong = (Emp)factory.getBean("hong");
		System.out.println(hong);
		
		
	}
}
