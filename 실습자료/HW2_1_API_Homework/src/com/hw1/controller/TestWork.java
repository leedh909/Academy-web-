package com.hw1.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestWork {

	public TestWork() {}

	public void afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		int count = st.countTokens();	//nextToken�ϸ� ��ū���� �Һ��ؼ� ���߿� countTokens�� �ϸ� 0�� ��� �ǹǷ� �̸� ��Ƶ־� �ȴ�.
		
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		
		System.out.println("��ū ó�� �� ���� : " + str);
		System.out.println("��ū ó�� �� ���� : " + str.length());
		System.out.println("��ū ó�� �� ���� : " + sb);
		System.out.println("��ū ó�� �� ���� : " + count);
		System.out.println("��� �빮�ڷ� ��ȯ : " + sb.toString().toUpperCase());
	}
	
	public void findChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		// ù���ڸ� �빮�ڷ� �ٲٱ�
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(i==0) sb.append(str.toUpperCase().charAt(i));
			else sb.append(str.charAt(i));
		}
		System.out.println("ù ���� �빮�� : " + sb);
		
		// ã�� ���� ���� ã��
		System.out.print("ã�� ���� �ϳ��� �Է��ϼ��� : ");
		char ch = sc.nextLine().charAt(0);
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) count++; 
		}
		System.out.println(ch + " ���ڰ� �� ���� : " + count);
	}
}
