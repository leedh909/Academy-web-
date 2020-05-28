package com.test01.bbb;

import com.test01.aaa.AAA;

public class Test {

	public static void main(String[] args) {

		
		BBB b1 = new BBB();
		
		b1.setAbc(1);  //AAA의 메소드인데 상속 받아서 사용가능하다.
		b1.setB(2);
		System.out.println(b1.getAbc()+"+"+b1.getB()+"="+b1.getSum());
		
		
		BBB b2 = new BBB(3);  //BBB클래스에서 초기화 해준 부분을 보면 Abc를 b로 초기화해준걸 볼수있다.
		b2.setB(4);   //초기화 할때 3이 들어갔다가 4로 값을 변경해준것이다.
		System.out.println(b2.getAbc()+"+"+b2.getB()+"="+b2.getSum());
		
		
		BBB b3 = new BBB(5,6);
		System.out.println(b3.getAbc()+"+"+b3.getB()+"="+b3.getSum());
		
		System.out.println("------------------------------------------");
		
		
		AAA a = new AAA();
		BBB b = new BBB();
		a.prn();
		b.prn();
		
		
		
		
	}

}
