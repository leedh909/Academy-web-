package com.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example {
	
	//BufferedReader의 입력 받는 값은 매번 값을 입력받고 출력을 해줘야한다.(파일 입출력 사용할때 배울거임) 
//	public void example4() {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String a,b;
//		
//		try {
//			System.out.print("a: ");
//			a= br.readLine();
//			System.out.print("b: ");
//			b= br.readLine();
//			//System.out.println("합: "+(Double.parseDouble(a)+Double.parseDouble(b)));
//			//System.out.println(a.charAt(3));
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//	}

	public void example1() {
		
		System.out.println("[연습문제1]");
		int a, b;
				
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");		
		a=sc.nextInt();
		System.out.print("두번째 정수: ");
		b=sc.nextInt();
		
		System.out.println("더하기 결과: "+(a+b));
		System.out.println("빼기 결과: "+(a-b));
		System.out.println("곱하기 결과: "+(a*b));
		System.out.println("나누기한 몫: "+(a/b));
		System.out.println("나누기한 나머지: "+(a%b));
		
	}
	
	public void example2() {
		
		System.out.println("[연습문제2]");
		double width;
		double height;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("가로 : ");
		width=sc.nextDouble();
		System.out.print("세로 : ");
		height=sc.nextDouble();
		
		System.out.println("면적 : "+(width*height));
		System.out.println("둘레 : "+((width+height)*2));
		
	}
	
	public void example3() {
		System.out.println("[연습문제3]");
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : ");
		str=sc.nextLine();
		System.out.println("첫번째 문자 : "+str.charAt(0));
		System.out.println("두번째 문자 : "+str.charAt(1));
		System.out.println("세번째 문자 : "+str.charAt(2));
	}
	
}
