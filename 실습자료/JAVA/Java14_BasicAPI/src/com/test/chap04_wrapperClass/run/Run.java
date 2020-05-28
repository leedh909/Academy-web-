package com.test.chap04_wrapperClass.run;

public class Run {

	public static void main(String[] args) {

		//Boxing :  기본자료형 --> Wrapper클래스 객체
		//UnBoxing : Wrapper클래스 객체 --> 기본자료형
		
		//Boxing
			Integer i= new Integer(10);
			Integer i2 = new Integer(15);
			Double d = new Double(10.0);
		
			System.out.println(i.equals(i2));
			System.out.println(i.compareTo(i2));
			//0 -> 같을때, 양수면 i가 큰수일때, 음수면 i2가 큰수일때.
			
		//AutoBoxing(자동 처리)
			short i3 = 10;
			Integer i4 = 5;
			//Integer i4 = new Integer(5);
	
		//UnBoxing
			int pi = i.intValue();
			double pd = d.doubleValue();
			
		//AutoUnBoxing
			int a = i;
			int b = i2;
			System.out.println(a+b);
			int c =2;
			int c2 = 4;
			
			abox(c+c2);
			
		
			abox(a+b);
			//int >>(autoboxing)>>Integer >>(다형성)>>Object
		
	}
	
	public static void abox(Object obj) { //다형성
		
		System.out.println((int)obj);
		System.out.println((Integer)obj);
		
	}
	
	
	
	
	
	
	
	
}
