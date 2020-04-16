package com.hw1.run;

import com.hw1.controller.TestWork;

public class Run {

	public static void main(String[] args) {

		String str="J a v a P r o g r a m";
		TestWork tw = new TestWork();
		
		System.out.println("-----토큰 처리하기-----");
		tw.afterToken(str);
		
		System.out.println("-----문자 갯수 찾기-----");
		
		tw.findChar();
		
		
	}

}
