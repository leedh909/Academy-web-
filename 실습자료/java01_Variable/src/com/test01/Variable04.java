package com.test01;

public class Variable04 {

	public static void main(String[] args) {
		
		//상수
		int age;
		final int AGE;
		
		//초기화
		age=20;
		AGE=20;
		
		//출력
		System.out.println("age: "+age);
		System.out.println("AGE: "+AGE);
		
		//변수값 변경
		age=30;
		//AGE=30; //상수 변경시 코드상의 에러발생=상수값 변경 불가.
		
		System.out.println("변경후 age: " +age);
		System.out.println("변경후 AGE: "+ AGE);
		
	}

}
