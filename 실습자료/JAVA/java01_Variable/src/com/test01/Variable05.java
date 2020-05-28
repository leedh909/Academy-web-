package com.test01;

public class Variable05 {

	public static void main(String[] args) {
		Variable05 test = new Variable05();
		test.testOverflow();
		
		
	}
	
	public void testOverflow() {
		
		//byte bnum = 128;
		//에러, 범위를 벗어난 값. byte는 최대 값이 127이다.
		
		//계산과정에서 범위를 벗어나면 오버플로우 처리된다.
		
		byte bnum = 127;
		bnum = (byte)(bnum+1); //byte + int = int
		System.out.println("bnum : "+bnum);
		//오버플로우 현상이 일어난다.(값이 순환된다)
		
		
		
		
	}
	
	
	
	
}
