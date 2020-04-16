package com.hw1.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestWork {

	public TestWork() {}
	public String afterToken(String str) {
		System.out.println("토큰 처리 전 글자: "+str);
		System.out.println("토큰 처리 전 갯수: "+str.length());
		
		StringTokenizer st = new StringTokenizer(str, " ");	
		
		String res ="";
		
		while(st.hasMoreTokens()) {
			res+=st.nextToken();
		}
		
		System.out.println("토큰 처리 후 글자: "+res);
		System.out.println("토큰 처리 후 갯수: "+res.length());
		System.out.println("모든 대문자로 변화: "+res.toUpperCase());
		return null;
	}
	public void findChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오: ");
		String str = sc.next();
		String res = "";
		
		for(int i =0; i<str.length();i++) {
			
			if(i==0) {
				res+=Character.toUpperCase(str.charAt(i));
			}else {
				res+=str.charAt(i);
			}
			
		}
		
		System.out.println("첫 글자 대문자 : "+res);
		
		System.out.print("찾을 문자 하나를 입력하세요: ");
		char one = sc.next().charAt(0);
		int count =0;
	
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==one) {
				count++;
			}
		}
		
		System.out.println(one+" 문자가 들어간 갯수: "+count);
		
		
	}
	
	
	
}
