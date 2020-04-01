package com.home.controller;

import java.util.Scanner;

public class Function {
	
	Scanner sc = new Scanner(System.in);
	
	public void calculator() {
		System.out.print("첫번째 정수 : ");
		int num1=sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2=sc.nextInt();
		System.out.print("연산문자 : ");
		char cal = sc.next().charAt(0); 
		int result=0;
		switch(cal) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case 'x':
		case '*':
		case 'X':
			result=num1*num2;
			break;
		case '/':
			if(num2>0) {
				result=num1/num2;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
				result=0;
			}
			break;
		default:
			System.out.println("연산문자가 아닙니다.");
		
		}
		System.out.println("결과값: "+num1+" "+cal+" "+num2+" = "+result );
		
	}
	
	public void totalCalculator() {
		System.out.println("두 정수 입력 ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int max,min;
		int sum=0;
		
		max=Math.max(num1, num2);
		min=Math.min(num1, num2);
		
		for(int i=min;i<=max;i++) {
			sum+=i;
		}
		System.out.println(min+"부터 "+max+"까지 정수들의 합계: "+sum);
		
		
	}
	
	public void profile() {
		
	}
	
	
	public void sungjuk() {
		
	}
	
	public void printStarNumber() {
		
	}
	
	public void sumRandomNumber() {
		
	}
	
	public void continueGugudan() {
		
	}
	
	public void shutNumber() {
		
	}
}
