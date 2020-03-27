package com.test01;

import java.util.Scanner;

public class Variable03 {

	public static void main(String args[]) {
		
		Variable03 test=new Variable03();
		//클래스명 변수명 = new 클래스명();
		test.changeValue();
		//변수명.메소드 명(); //메소드 실행
		
	}
	
	public void changeValue() {
		
		//변수선언->메모리 공간을 할당 받겠다.
		String name;
		char gender;
		int age;
		double height;
		
		
		//초기화
		name= "이대희";
		gender='M';
		age=27;
		height=2020.3;
		
		//입력값 출력
		System.out.println(name+"님의 정보");
		System.out.println("gender(성별): "+gender);
		System.out.println("age(나이): "+age);
		System.out.println("height(키): "+height);
		
		
		//키보드로 입력받아 변수에 저장된 값 변경
		Scanner sc= new Scanner(System.in);
		
		System.out.print("이름: ");
		name=sc.nextLine();
		System.out.print("gender(성별): ");
		gender=sc.next().charAt(0);
		//문자를 읽어오는 메소드는 제공하지X, 그래서 charAt() 사용.
		//charAt(숫자) -> 숫자에 있는 부분을 자른다.(=가져온다) 
		System.out.print("age(나이): ");
		age=sc.nextInt();
		System.out.print("height(키): ");
		height=sc.nextDouble();
		
		System.out.println("바뀐 값 입니다.");
		System.out.println(name+"님의 정보");
		System.out.println("gender(성별): "+gender);
		System.out.println("age(나이): "+age);
		System.out.println("height(키): "+height);
		
		
		
	}
	
	
	
	
	
	
}
