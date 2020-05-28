package com.test.chap01_runtimeException;

import java.util.Scanner;

public class RunExcepPrac {

	Scanner sc = new Scanner(System.in);
	
	//RuntimeException->ArithmeticException
	public void ArithEx() {
		int ran=0;
		double res=0.0;
		
		while(true) {
			ran = (int)(Math.random()*10)+1;
			
			System.out.print("나눌 수를 입력: ");
			int no=sc.nextInt();
			
			if(no==0) {
				System.out.println("0이 아닌값 입력하세요!");
			}else {
				res = ran/(double)no;
				System.out.println(ran+" / "+no+" = "+res);
			}
			
		}
		
	}
	
	
	public void ClassNArrayEx() {
	//ClassCastException : 형변환 에러이다. (형변환을 고쳐준다.)
//		Object obj = 'a';
//		System.out.println(obj);
//		//char를 string으로 바꾸려니깐 에러가 뜬다.
//		String str = (String)obj;
//		System.out.println(str);
		
	//ArrayIndexOutOfBoundsException : 배열 범위가 잘못되면 나오는 에러.
//		int[] arr = new int[2];
//		arr[0] = 1;
//		arr[1] = 2;
//		
//		arr[2]=3;
//		System.out.println("출력문이 실행 될까요???"); //안된다.
		
		
	//NullPointerException
//		try {
//			//ArrayIndexOutOfBoundsException
//			int[] arr = new int[2];
//			arr[0] = 1;
//			arr[1] = 2;
//			
//			arr[2]=3;
//			System.out.println("출력문이 실행 될까요???");
//			
//			String str= null;
//			int len = str.length();
//			System.out.println(len);
//		}catch(NullPointerException e) {
//			System.out.println("널포인터 익셉션");
//			e.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndex에러 발생");
//			e.printStackTrace();
//		
//		}finally {
//			System.out.println("프로그램 종료");
//		}
		
		
	//catch문 합치기!!!!!
		//NullPointerException
		try {
			//ArrayIndexOutOfBoundsException
//			int[] arr = new int[2];
//			arr[0] = 1;
//			arr[1] = 2;
//			
//			arr[2]=3;
//			System.out.println("출력문이 실행 될까요???");
			
			String str= null;
			int len = str.length();
			System.out.println(len);
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("어레이 인덱스  or 널포인터 익셉션");
			e.printStackTrace();
		}finally {
			System.out.println("프로그램 종료");
		}
	
		
		
		
		
	}
	
	
	
}
