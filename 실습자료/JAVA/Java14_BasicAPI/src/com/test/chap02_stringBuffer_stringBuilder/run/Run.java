package com.test.chap02_stringBuffer_stringBuilder.run;

public class Run {
	
	/*
	 	StringBuffer , StringBuilder의 특징
	  - mutable클래스(가변=변할수 있는), 변경과 저장을 위한 메모리공간(버퍼)을 내부에 지닌다.
	  - 버퍼의 초기값 16개의 문자를 저장 가능하다. 자동으로 증가

	 */

	public static void main(String[] args) {

		Run.method1();
//		Run.method2();
//		Run.method3();

	}
	
	public static void method1() {
		
		StringBuilder sb = new StringBuilder("내일만 나오면 휴일");
		System.out.println(sb.length()); //10
		System.out.println(sb.capacity()); //16(기본용량)+10
		
		StringBuilder sb1 = new StringBuilder(21);
		System.out.println(sb1.capacity()); //용량을 지정할 수 있다.
		
		System.out.println(sb);
		
	}
	
	public static void method2() {
		//불변인지 가변인지 판단
		//불변하면 할당되는 주소의 값이 달라진다.
		//가변하면 할당되는 주소의 값이 변하지 않는다.
		String str = "반가워! ";
		System.out.println("str 기존: "+str+", 주소: "+str.hashCode());
		str+=" 나는 String이라고 해 ";
		System.out.println("str 추가 후 : "+str+", 주소: "+str.hashCode());
		
		
		StringBuffer sbf = new StringBuffer("안녕! ");
		System.out.println("sbf 기존: "+sbf+", 주소: "+sbf.hashCode());
		sbf.append("난 StringBuffer얌!");
		System.out.println("sbf 추가 후: "+sbf+", 주소: "+sbf.hashCode());
		
		StringBuilder sbd = new StringBuilder("하이~");
		System.out.println(sbd+"의 주소: "+sbd.hashCode());
		sbd.append("난 StringBuilder지");
		System.out.println(sbd+"의 변경 후 주소: "+sbd.hashCode());
	}
	
	public static void method3() {
		
//		StringBuffer sb = new StringBuffer("저는 ");
		StringBuilder sb = new StringBuilder("난 ");
		//append : 해당 객체에 추가 정보를 입력하고 싶을때 사용
//		sb.append("배가 불러요~");
//		sb.append("~~!");
		
		sb.append("배가 불러요").append("~~!!");
		//=>메소드 체이닝.(메소드끼리 .으로 연결되어있는 걸 의미)
		System.out.println(sb);
		
		//insert : 범위안에 넣는다.
		sb.insert(2, "점심을 먹어서");
		System.out.println(sb);
		
		//delete : 범위안에 삭제
		sb.delete(2, 9);
		System.out.println(sb);
		
		//reverse(뒤집기)
		sb.reverse();
		System.out.println(sb);
		
	}
	
	
	
	

}
