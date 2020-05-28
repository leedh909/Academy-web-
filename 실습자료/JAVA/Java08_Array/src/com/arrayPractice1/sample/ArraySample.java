package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public void test1() {
//강사님 코딩		
		int[] ar = new int[10];
		Random r = new Random();
		int sum=0;
		
		for(int i =0;i<ar.length;i++) {
			
			ar[i]= r.nextInt(100)+1; //1~100사이의 난수
			
			sum+=ar[i];
			System.out.println(i+ "방 값: "+ar[i]);
			
			
			
		}
		System.out.println("sum: "+sum);
	
//내가 생각한 것들.		
//java.util 패키지 이용.	
//		Random ran = new Random();
//		int[] arr=new int[10];
//		int sum=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			int random = ran.nextInt()%100+1;
//			arr[i]=Math.abs(random);
//			sum+=arr[i];
//			System.out.println("arr["+i+"]: "+arr[i]);
//		}
//java.lang 패키지 이용.		
//		for(int i=0; i<arr.length;i++) {
//			
//			int random = (int)(Math.random()*100+1);
//			arr[i]=random;
//			sum+=arr[i];
//			System.out.println("arr["+i+"]: "+arr[i]);
//		
//		}

//		System.out.println();
//		System.out.println("각 방들의 합은 "+sum+"입니다.");
		
		
	}
	
	public void test2() {
		int[] arr = new int[10];
		int max=0;
		int min=100;
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(int)(Math.random()*100+1);
			
			max=Math.max(max, arr[i]);
			min=Math.min(min, arr[i]);	
			System.out.println(i+" 방의 값: "+arr[i]);
		}
		System.out.println("기록된 값중 제일 큰값: "+max);
		System.out.println("기록된 값중 제일 작은값: "+min);
		
	}
	
	public void test3() {
		Random r =new Random();
		byte[] arr=new byte[10];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=(byte)(r.nextInt(127)+1);
			if(arr[i]%2==0) {
				System.out.println(i+"번방의 값: "+arr[i]);
				sum+=arr[i];
			}
			
		}
		System.out.println("각 방의 짝수 값의 합 : "+sum );
		
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str =sc.next();
		int sum=0;
//		int b = (Integer.parseInt(str.substring(str.length()-1)));
//		System.out.println(b);
		
//		for(int i=0;i<=str.length()-1;i++) {
//			String s = str.substring(i);
//			//int a = (Integer.parseInt(str.substring(i)) - Integer.parseInt(str.substring(i+1)))/(int)Math.pow(10, str.length()-(i+1));
//			int a = Integer.parseInt(str.substring(i))/(int)Math.pow(10, str.length()-(i+1));
//			//substring 입력값 아래의 인덱스들을 가져온다.
//			System.out.println(a);
//			sum+=a;
//		}
		//sum+=b;
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.substring(i, i+1));
			sum+=Integer.parseInt(str.substring(i, i+1));
		}
		
		System.out.println("sum: "+sum);
		
	}
	
	public void test4_1() {
		//강사님 코딩
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("숫자 입력:");
		String val = sc.next();
			
		if(val!=null && val.length()>0) {
			for(int i =0;i<val.length();i++) {
				String s= val.substring(i, i+1);				
				sum+= Integer.parseInt(s);
			}
		}else {
			System.out.println("입력된 값이 없습니다.");
		}
		System.out.println("합계: "+sum);
		
		
		
		
	}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str =sc.next();
		int sum=0;
		
		for(int i=0;i<str.length();i++) {

//			System.out.println((int)str.charAt(i));
//			sum+=(int)str.charAt(i)-48;
			sum+=Character.getNumericValue(str.charAt(i));
			
		}
		System.out.println("sum: "+sum);
	}
	
	public void test5_1() {
		//강사님 코딩
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		String val =sc.next();
		int sum=0;
		
		for(int i=0; i<val.length();i++) {
			
			System.out.println((int)val.charAt(i)-48);
			sum+=(int)val.charAt(i)-48;
		}
		System.out.println("sum: "+sum);

		
	}
}
