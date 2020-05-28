package com.silsub2.book.controller;

import java.util.Scanner;

import com.silsub2.book.model.Book;

public class BookManager {

	private Book[] bar=null;
	Scanner sc = new Scanner(System.in);
	
	private static int count=0;
	
	public BookManager() {
		bar=new Book[10];
		for(int i=0;i<bar.length;i++) {
			bar[i]= new Book();
		}
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		BookManager.count=count;
	}
	public void menu() {
		
		String answer="";
		do {
			System.out.println("<메뉴화면>");
			System.out.println("***** 도서 관리 메뉴 *****");
			System.out.println("1. 도서 정보 추가");
			System.out.println("2. 모두 출력");
			System.out.println("7. 끝내기");
			
			System.out.println("원하는 메뉴를 선택하시오. ");
			int choose = sc.nextInt();
			
			switch(choose) {
			case 1:
				bookInput();
				break;
			case 2:
				bookAllOutput();
				break;
			case 7:
				System.out.println("프로그램이 종료 되었습니다.");
				return;
				
			default:
				System.out.println("잘못 입력하셨습니다.");
			
			}
			System.out.println("다른 메뉴를 이용하시겠습니까?(y/n):");
			answer=sc.next();
			
		}while(answer.equals("Y")||answer.equals("y"));
			
	}
	
	
	public void bookInput() {
		
		System.out.println("*****도서 정보 입력*****");
		System.out.println("도서 제목: ");
		String name = sc.next();
		System.out.println("도서 저자: ");
		String author = sc.next();
		System.out.println("도서 출판사: ");
		String publisher = sc.next();
		System.out.println("도서 가격: ");
		int price = sc.nextInt();
		
		bar[count]= new Book(name,author,publisher,price);
		
		count++;
	}
	public void bookAllOutput() {
		
		System.out.println("지금까지 입력된 도서 목록");
		for(int i=0;i<count;i++) {			
			System.out.println(i+"번째 도서정보: "+bar[i].info());
		}
	}
	
	
	
}
