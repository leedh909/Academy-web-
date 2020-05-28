package com.io.silsub2.controller;

import java.util.Scanner;

import com.io.silsub2.model.dao.NoteDao;

public class NoteManager {

	public void fileSave() {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		NoteDao nd = new NoteDao();
		String str = null;
		char answer=' ';
		String fileName="";
		
		do {
			System.out.print("파일에 저장할 내용을 입력하시오. : ");
			str = sc.next();
			
			if(str.equals("exit")) {
				System.out.print("저장하시겠습니가? (y/n) : ");
				answer = sc.next().charAt(0);
				
				if(answer=='Y'||answer=='y') {
					
					System.out.print("저장할 파일명을 입력하시오 : ");
					fileName = sc.next();
				
					nd.fileSave(sb, fileName);
					break;
				}else {
					System.out.println("다시 입력하세요. ");
					sb= new StringBuilder();
				}
				
			}else {
				sb.append(str+" \n");
			}

		}while(true);
		
	
	}

	public void fileOpen() {

		Scanner sc = new Scanner(System.in);
		StringBuilder res = new StringBuilder();
		System.out.print("열기할 파일명을 입력하세요 : ");
		String str = sc.next();
			
		NoteDao nd = new NoteDao();
		res = nd.fileOpen(str);
		
		System.out.println(res);
		
		
		
	}

	
	
	
	
	
	
	
}
