package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {

		//Book 객체 생성
		Book b1 = new Book("수학의 정석","나수학",100);
		Book b2 = new Book("프로그래밍","케이에이치",12000);
		
		//1. toString();은 객체 호출시 자동으로 뒤에 JVM에 의해 생성 
		System.out.println("b1= "+b1.toString());
		System.out.println("b2= "+b2.toString());
	
		
		//2. equals
		System.out.println("b1과 b2는 같은 객체? : "+b1.equals(b2));
		
		//얕은 복사
		Book b3 = b1;
		System.out.println("b1과 b3는 같은 객체? : "+b1.equals(b3));
		
		Book b4 = new Book("수학의 정석","나수학",100);
		System.out.println("b1과 b4는 같은 객체? : "+b1.equals(b4)); //주소가 달라서 다른 객체로 본다.
		
		//
		System.out.println("b1의 hashCode : "+ b1.hashCode());
		System.out.println("b4의 hashCode : "+ b4.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
