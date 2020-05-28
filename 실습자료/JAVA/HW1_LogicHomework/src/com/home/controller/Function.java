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
		String name="홍길동";
		int age=26;
		String gender="남자";
		String str="고집불통";
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("성별: "+gender);
		System.out.println("성격: "+str);
		
		
	}
		
	public void sungjuk() {
		System.out.print("학생 이름: ");
		String name =sc.nextLine();
		System.out.print("학년: ");
		int hac = sc.nextInt();
		System.out.print("반: ");
		int ban = sc.nextInt();
		System.out.print("번호: ");
		int num = sc.nextInt();
		System.out.print("성별(M/F): ");
		char gender =sc.next().charAt(0);
		String res="";
		res =(gender=='M')? "남학생" :"여학생" ;
		System.out.print("성적: ");
		double point = sc.nextDouble(); 
		
		char grade =' ';
		
		
		
		if(point>=90) {
			grade ='A';
		}else if(point>=80) {
			grade ='B';
		}else if(point>=70) {
			grade ='C';
		}else if(point>=60) {
			grade ='D';
		}else {
			grade ='F';
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고, %c 학점입니다. \n", hac,ban,num,res,name,point,grade);
		
		
	}
	
	public void printStarNumber() {
		System.out.print("정수 하나 입력: ");
		int num=sc.nextInt();
		if(num>0) {
			for(int i=1;i<=num;i++) {
				for(int j=1;j<=i;j++) {
					if(i==j) {
						System.out.println(i);
					}else {
						System.out.print("*");
					}
				}
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
		
		
	}
	
	public void sumRandomNumber() {
	
		int random = ((int)(Math.random()*100+1));
		
		int sum=0;
		for(int i=1; i<=random;i++) {
			sum+=i;
		}
		System.out.println("1 부터 "+random+" 의 합은  "+sum+"입니다.");
	}
	
	public void continueGugudan() {
		System.out.print("단수: ");
		int dan = sc.nextInt();
		System.out.print("제외할 배수: ");
		int ex = sc.nextInt();
		
		if(dan>0) {
			// 구구단 단수 결과값에서 제외할 단수 ->출력
			for(int i=1;i<=9;i++) {
				boolean go = true;
				for(int j=1;j<=81;j++) {
					if((dan*i)==(ex*j)) {
						go=false;
						break;
					}
				}
				
				if(go==true) {
					System.out.println(dan+"*"+i+"="+(dan*i));
				}
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}

	}

	public void shutNumber() {
		//두 주사위 경우의 수 36개 
		String answer="";
		
		do {
			int random1 = (int)(Math.random()*6+1);
			int random2 = (int)(Math.random()*6+1);
			int sum=random1+random2;
			int all = random1*random2;		
			
			if(sum==all) {
				System.out.println("합: "+sum+"이고, 경우의 수 중 하나: "+all+"입니다.");
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("합: "+sum+"이고, 경우의 수 중 하나: "+all+"입니다.");
				System.out.println("틀렸습니다.");
			}
			
			
			System.out.print("계속하시겠습니까?(y/n) : ");
			answer=sc.next();
		}while(answer.charAt(0)=='y'||answer.charAt(0)=='Y');
		
		
		
		
	}
}
