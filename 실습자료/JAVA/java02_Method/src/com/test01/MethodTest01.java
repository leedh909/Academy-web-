package com.test01;

public class MethodTest01 {

	public static void main(String[] args) {
		
		//static method 사용
		//1. 클래스명.메소드명(); //제일 보편화된 방법 확실히 알기 편하다.
		MethodTest01.publicMethod();
		MethodTest01.protectedMethod();
		
		//2.메소드명();
		defaultMethod();
		privateMethod();
		
		//non static 은 클래스를 생성해줘야 사용가능하다.
		MethodTest01 mt01 = new MethodTest01();
		mt01.NonStaticMethod();
		
	}
	
	//접근제한자!!
	//어디서나 접근, ( + )
	public static void publicMethod() {
		System.out.println("public method");
	}
	
	//상속일 경우 상속된 곳에서, 상속이 아닌 경우 같은 패키지 내에서, ( # )
	protected static void protectedMethod() {
		System.out.println("protectedMethod()");
	}
	
	//같은 패키지 내에서, ( default )
	static void defaultMethod() {
		System.out.println("defaultMethod()");
	}
	
	//현재 클래스 내에서만, ( - )
	private static void privateMethod() {
		System.out.println("privateMethod()");
	}
	
	//static 메소드는 오직 스태틱메소드만 접근 가능
	public void NonStaticMethod() {
		System.out.println("non static method()");
	}
	
}
