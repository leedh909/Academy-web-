package com.hw1.run;

import com.hw1.controller.TestWork;

public class Run {
	public static void main(String[] args) {
		String str = "J a v a P r o g r a m";
		TestWork tw = new TestWork();
		System.out.println("------��ūó���ϱ�------");
		tw.afterToken(str);
		
		System.out.println("------���� ���� ã��------");
		tw.findChar();
	}

}
