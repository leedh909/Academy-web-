package com.test01;

import java.util.Scanner;

public class ArrayTest01 {

	public void testArray() {
		
		//배열의 사용 이유 
//		int num1=10;
//		int num2=20;
//		int num3=30;
//		int num4=40;
//		int num5=50;
//		
//		int sum = 0;
//		
//		sum+=num1;
//		sum+=num2;
//		sum+=num3;
//		sum+=num4;
//		sum+=num5;


		//배열 선언 및 할당
		int[] arr = new int[5];
		
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
		
		for(int i = 0; i<arr.length;i++) {
			
			arr[i]=10*i;
//			System.out.println(arr[i]);	
//			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
//		System.out.println("arr[0]:"+arr[0]);
//		System.out.println("arr[1]:"+arr[1]);
//		System.out.println("arr[2]:"+arr[2]);
//		System.out.println("arr[3]:"+arr[3]);
//		System.out.println("arr[4]:"+arr[4]);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
	}
	
	public void testArray2() {
		
		//배열 선언
		//자료형[] 변수명;
		//자료형 변수명[];
		
		//선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는것.
		//int[] iarr;
		//char carr[];
		//String strr[];
		
		//할당은 new 연산자를 이용하여 heap영역에 공간을 만드는것.
		//iarr=new int[5];
		//carr= new char[3];
		
		//선언과 할당
		int[] iarr = new int[5];
		char carr[] = new char[10];
		
		System.out.println("iarr: "+iarr);
		System.out.println("carr: "+carr);
		
		//hashcode = 주소값이라고 생각해라.
		//해쉬코드 : 실제주소값은 아니지만 주소값이라 생각해도 상관없다.
		//실제 주소를 찾기 위한 key 역할
		System.out.println("iarr의 hashcode: "+iarr.hashCode());
		System.out.println("carr의 hashcode: "+carr.hashCode());
		
		
		//배열의 길이
		//String.length() --- 배열.length
		//()가 있으면 메소드 --- 가로가 붙지않으면 변수이다.(=필드에 저장되어있는 변수)
		System.out.println("iarr의 길이: "+iarr.length);
		System.out.println("carr의 길이: "+carr.length);
		
		
		//스캐너로 입력받은 정수로 배열 길이 지정
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 입력: ");
		int size =sc.nextInt();
		
		double[] darr = new double[size];
		//int[] iarr2 = new int[sc.nextInt()];
		
		System.out.println("darr의 길이: "+darr.length);		
		System.out.println("darr의 hashcode: "+darr.hashCode());
		
		darr = new double[30];
		//새롭게 30개 짜리 방을 만들고 새로운 주소값을 받은것이다.
		//배열의 사이즈를 바꾸지 못한다.!!!! 중요 !!!!
		
		System.out.println("darr의 길이: "+darr.length);
		System.out.println("darr의 hashcode: "+darr.hashCode());
				
		//배열 삭제
		darr=null;
		//할당받는 주소를 없앤다. 하지만 배열공간은 사라지지않는다.
		//하지만 시간이 지나면 자바가 알아서 가비지컬렉터에서 지워준다.
		System.out.println("삭제 후 darr의 길이: "+darr.length);
		//위처럼 호출시 NullPointerException이 뜬다. null을 호출시 많이 발생.
		
		
		
	}
	
	
	public void testArray3() {
		
		int[] iarr = new int[5];
		
		for(int i=0;i<iarr.length;i++) {
			System.out.println("iarr["+i+"]의 값: "+iarr[i]);
			//아무것도 안넣으면 JVM이 기본적으로 지정한 초기값으로 설정된다.
		}
		
		//int[] iarr2 = {11,22,33,44,55,66,77,88};
		//방이 생성되면서 초기값도 지정해준다.
		int[] iarr2 = new int[] {11,22,33,44,55};
		System.out.println("iarr2의 길이: "+iarr2.length);
		
		String[] sarr = {"apple","banana","orange"};
		for(int i=0;i<sarr.length;i++) {
			System.out.println("sarr["+i+"]의 값: "+sarr[i]);
		}

	}
	
	

}
