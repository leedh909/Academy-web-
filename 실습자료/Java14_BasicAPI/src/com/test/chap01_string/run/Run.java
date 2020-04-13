package com.test.chap01_string.run;

public class Run {

	//String 
	//immutable(불변), 변경은 적고, 읽기가 많은 경우
	
	
	public static void main(String[] args) {

//		Run.method1();
		Run.method2();
		

		
	}

	public static void method1() {
		
		//1.문자열을 리터럴로 생성
		String str = "abc";
		String str1 = "abc";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		//JVM이 String pool에 등록 시키고 리터럴로 문자열 생성할 때
		//동일한 값이 다시 호출될 때에는 String pool에 등록된 값을 리턴
		System.out.println();
		
		//2. 생성자를 통한 문자열 생성
		String str2 = new String("abc");
		String str3 = new String("abc");
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		//오버라이딩 되어 있어서 다른 객체지만 같은 hashCode()값이 나온다.
		//그러나 제대로 HashCode()값을 찍으면 둘은 다르다.
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

	}
	
	public static void method2() {
		
		//charAt(index)
		String str ="abc";
		System.out.println(str.charAt(1));
		
		//concat() : 합치기
		System.out.println(str.concat("def"));
		
		//contains() : 포함여부
		System.out.println(str.contains("ac"));
		
		//equals() : 비교
		System.out.println(str.equals("abc"));
		
		//length() : 길이
		System.out.println(str.length());
		
		//split() : 나누다
		String str1 = "ab,c,def";
		String[] strArr = str1.split(","); //나눈 값은 배열값으로 반환받는다.
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		//향상된 for문 //for-each문이다.
		//배열에 있는 값을 String으로 뽑아낸다.(arr은 계속 초기화됨)
		for(String arr: strArr) {
			System.out.println(arr);
		}
		
		int[] iarr = {1,2,3,4,5,6};
		for(int ar:iarr) {
			System.out.println(ar);
		}
				
		//toUpperCase() : 대문자
		System.out.println(str.toUpperCase());
		
		//substring() : 잘라내기
		System.out.println(str1.substring(2,5));
		
		//trim() : 앞뒤 공백제거
		String str2 ="        ab   c  ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
		//replaceAll(바꿀값, 바뀐값)
		System.out.println(str2.replaceAll(" ", ""));
		
		
		
	}
	
	
	
}
