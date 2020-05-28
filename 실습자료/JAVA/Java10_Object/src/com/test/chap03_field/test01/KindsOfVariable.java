package com.test.chap03_field.test01;

public class KindsOfVariable {//클래스 영역의 시작
	//클래스 영역에 작성하는 변수를 필드라 한다.
	//필드==멤버변수(클래스가 가지는 멤버라는 의미)==전역변수(클래스 전역에서 사용할수 있는 변수라는 의미)
	private int globalNum;
	
	public void testMethod(int num) {//메소드 영역의 시작
		//메소드 영역에서 작성하는 변수를 지역변수라고 한다.
		//메소드 선언시 괄호안에 선언하는 변수를 매개변수라고 한다.
		int localNum=0;
		//매개변수는 호출시 값이 넘어와서 변경되기 때문에 초기화가 필요없다.
		System.out.println(num);
		//지역변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화
		System.out.println(localNum);
		
		//전역 변수는 클래스 전역에서 사용가능
		System.out.println(globalNum);
		
	}//메소드 영역의 끝
	
	public void testMethod2() {

//		System.out.println(localNum);
		System.out.println(globalNum);
	
	}
	
	
	
}//클래스 영역의 끝
