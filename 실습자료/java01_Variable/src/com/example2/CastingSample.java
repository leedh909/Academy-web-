package com.example2;

import java.util.Scanner;

public class CastingSample {

	public void printUniCode() {
		
		System.out.println("[실습 1]");
		Scanner sc= new Scanner(System.in);
		int a ; 
		String b;
		System.out.print("문자 입력: ");
		b=sc.nextLine();
		
		a= b.charAt(0) ;
		//System.out.println("A is unicode: "+ a);
		System.out.printf("%s is unicode: %d",b,a);
	}
	
	public void calculatorScore() {
		
		System.out.println("[실습 2]");
		Scanner sc= new Scanner(System.in);
		
		float a,b,c;
		System.out.print("국어 : ");
		a=sc.nextFloat();
		System.out.print("영어 : ");
		b=sc.nextFloat();
		System.out.print("수학 : ");
		c=sc.nextFloat();
		
		int sum, avg;
		sum=(int)(a+b+c);
		avg=sum/3;
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
	}
	
}
