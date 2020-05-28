package com.hw2.controller;

import java.util.Scanner;
import java.util.*;

public class SpaceUpper {

	
	public SpaceUpper() {}
	public void spaceToUpper() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어를 입력하시오(띄어쓰기 포함): ");
		String str= sc.nextLine();
		
		StringTokenizer st =  new StringTokenizer(str," ");
		String res ="";
		while(st.hasMoreTokens()){
			String res2=st.nextToken();
			for(int i=0;i<res2.length();i++) {
				
				if(i==0) {
					res+=Character.toUpperCase(res2.charAt(i));	
				}else {
					res+=res2.charAt(i);
				}
			}
			res+=" ";
		}
		
		StringBuilder sb = new StringBuilder(res);
		System.out.println(sb);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
