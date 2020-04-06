package com.test.chap01_encapsulation;

public class Main {

	public static void main(String[] args) {

		//객체 생성		
//		Account a = new Account();
//		System.out.println(a.name);
//		System.out.println(a.blance);
//		a.name = "홍길동";
//		a.blance=1000000;
//		System.out.println(a.name);
//		System.out.println(a.blance);
		
		
		Account a = new Account();
		//100만원 입금
		a.deposit(1000000);
		a.displayBalance();
		//150만원 입금
		a.deposit(1500000);
		a.displayBalance();
		//50만원 출금
		a.withdraw(500000);
		a.displayBalance();
		
		
		
		
		
	}

}
