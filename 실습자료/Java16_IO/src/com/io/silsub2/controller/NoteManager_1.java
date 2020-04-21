package com.io.silsub2.controller;

import java.util.Scanner;

import com.io.silsub2.model.dao.NoteDao_1;

public class NoteManager_1 {

	private Scanner sc = new Scanner(System.in);
	
	public void fileSave() {

		StringBuilder sb = new StringBuilder();
		System.out.print("파일에 저장할 내용을 입력: ");
		
		while(true) {
			String s = sc.nextLine();
			if(s.equals("exit")) {
				break;
			}
			sb.append(s+"\n");
		}
		
		System.out.print("저장하시겠습니까?(y/n) : ");
		char yn = sc.nextLine().toUpperCase().charAt(0);
	
		if(yn =='Y') {
			
			System.out.print("저장할 파일명 입력: ");
			String fileName = sc.nextLine();
			
			NoteDao_1 nd = new NoteDao_1();
			nd.fileSave(sb, fileName);
			
		}else {
			System.out.println("저장하지 않고 메뉴로 돌아갑니다.");
			return;
		}
	
	}

	public void fileOpen(String fileName) {

		StringBuilder sb = new NoteDao_1().fileOpen(fileName);
		
		System.out.println(sb);
		
		
		
	}

	
	
	
	
	
	
	
}
