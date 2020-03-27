package com.test01;

public class Variable06 {
	
	public static void main(String args[]) {
		
		//자동형변환 , 강제형변환
		Variable06 test = new Variable06();
		//test.rule1();
		//test.rule2();
		test.rule3();
	}
	
	public void rule1() {
		
		//자료형이 다르더라도 작은 크기의 변수 타입은 큰 변수 타입으로 저장가능
		//==>자동형변환, 묵시적형변환, upcasting
		int num = 'a';
		System.out.println("num: "+num);
		
		char ch = 97;
		System.out.println("ch: "+ch);
		//char ch2 =-97; //에러, 음수는 매칭되는 것이 없다.
		
			
		
		//큰변수 타입은 작은 변수 타입으로 자동변환되지 않기 때문에 명시해야한다..
		//==>강제형변환, 명시적형변환, downcasting
		char ch2  = (char)num;
		//int 자료형 변수의 값은 강제형변환 해야 한다.
		System.out.println("ch2: "+ch2);
	
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3: "+ch3);
				
	}
	
	public void rule2() {
		//다른 자료형끼리의 연산은 큰 자료형으로 자동형변환 후 연산처리된다.
		int inum =10;
		long lnum = 100;
		
		//int isum = inum + lnum;
		
		//방법1. 수행 결과를 int로 강제 형변환 한다.
		int isum = (int)(inum+lnum);
		System.out.println("isum: "+isum);
		
		
		//방법2. long형 값을 int로 강제 형변환 한다.
		int isum2 = inum + (int)lnum;
		System.out.println("isum2: "+isum2);
		
		//방법3. long형 변수로 받는다.
		long lsum = inum+lnum;
		System.out.println("lsum: "+lsum);

	}
	
	public void rule3() {
		
		long lnum = 100;   //크기는 long(8byte), float(4byte) 이지만 정수가 실수로 자동형변환 된다.
		float fnum = lnum; //정수는 실수로 자동형변환이 된다.
		System.out.println("fnum: "+fnum);
		
		
		//실수는 정수로 변경할때 강제형변환 해줘야 한다.
		double dnum = 10.5;
		int inum = (int)dnum;    //실수를 정수로 바꿀때 데이터로스가 생긴다.
		System.out.println("inum: "+inum);
		System.out.println("(double)inum: "+(double)inum);  //한번 사라지면 돌아오지 않는다.
		
		
	}
	
	
	
	
	
	
	

}
