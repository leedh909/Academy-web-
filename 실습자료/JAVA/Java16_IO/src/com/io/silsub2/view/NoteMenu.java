package com.io.silsub2.view;

import java.util.Scanner;

import com.io.silsub2.controller.NoteManager;

public class NoteMenu {

	public void menu() {
		
		NoteManager nma = new NoteManager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("******    MyNote    ******");
			System.out.println();
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 끝내기");
			System.out.println("");
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				nma.fileSave();
				break;
			case 2:
				nma.fileOpen();
				break;
			case 3:
				return; 
			default:
				System.out.println("잘못입력하셨습니다.");
	
			
			}
			
			
		}
		
		
	}
	
	
	
	
	
	
}
