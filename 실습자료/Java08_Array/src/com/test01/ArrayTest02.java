package com.test01;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		//String[] args 
		//문자열 배열로 받겠다.
		
		//1. a~z 일차원 배열 출력
		
		char[] ch = new char[26];
		
		for(int i=0;i<26;i++) {
			
			ch[i]=(char)((int)'a'+i);
			
		}
		//ArrayTest02.prn(ch);
		
		
		
		//2. 1번에서 만든 배열을 거꾸로 출력
		//ArrayTest02.reverse(ch);

		
		//3. 1번에서 만든 배열을 대문자로 바꾸어 출력
		ArrayTest02.upper(ch);
		
		
	}
	
	public static void prn(char[] ch) {
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
			if(i%6==5) {
				System.out.println();
			}
			
		}
		System.out.println();
		
		
	}
	public static void reverse(char[] ch) {
		
		char re[]=new char[ch.length];
		int temp=0;
		
		for(int i=ch.length-1; i>=0 ; i--){
			
			re[temp]=ch[i];
			System.out.print(re[temp]+" ");
			temp++;
			
		}			
		
//		for(int i=ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]+" ");
//		}
		
		
		
	}
	public static void upper(char[] ch) {
		
		char up[]=new char[ch.length];
		int temp=0;
		for(int i=0;i<ch.length;i++) {
//방법1			up[temp]=(char)((int)ch[i]-32);
//			temp++;
			
//방법1			ch[i]=(char)((int)ch[i]-32);
			//java.lang 은 import 하지 않아도 jvm이 자동으로 포함시켜 처리하는 패키지.
//방법2			
			ch[i]=Character.toUpperCase(ch[i]);	
		}
//		prn(up);
		prn(ch);
	}
	
	
	
	
	
	
	
	
}
