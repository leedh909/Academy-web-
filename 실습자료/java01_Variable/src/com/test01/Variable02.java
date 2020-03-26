package com.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Variable02 {

	// java.io 패키지에서 제공되는 클래스를 이용해서 키보드 입력 테스트
	public static void main(String[] args) {
		
		Variable02 test= new Variable02();
		
		//test.inputTest1();
		test.inputTest2();

	}

	
	public void inputTest1() {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수 한 개 입력:   ");
		
		try {
			String value = br.readLine();
			
//			System.out.println("입력 받은 값: "+value);
	
			int number = Integer.parseInt(value);
			System.out.println(number*3);
			
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		
	}
	
	public void inputTest2() {
		
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		System.out.println("이름: "+name+", 나이: "+age+", 키:"+height);
		
		
		
		
	}
	
	
}
