package com.io.silsub2.view;

import java.util.Scanner;

import com.io.silsub2.controller.NoteManager_1;

public class NoteMenu_1 {

	NoteManager_1 nm = new NoteManager_1();
	Scanner sc = new Scanner(System.in);
	
	
	public void menu() {
		
		do {
			System.out.println("=====MyNote=====");
			System.out.println();
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 끝내기");
			System.out.println();
			System.out.print("메뉴 선택: ");
			
			int no = sc.nextInt();
			sc.nextLine();  //위에 nextInt()에서 enter값이 버퍼에 남아있기때문에 nextLine()을 써서 enter값을 없앤다. 그럼 오류가 안생긴다.
			
			switch(no) {
			case 1: nm.fileSave(); break;
			case 2: fileOpen(); break;
			case 3: System.out.println("종료!!"); return;
				
			default: System.out.println("번호 선택이 잘못!");
					 System.out.println("다시 선택!");
		
			}

			
		}while(true);

	}
	
	public void fileOpen() {
		System.out.print("오픈할 파일명 입력: ");
		String fileName = sc.nextLine();
		System.out.println(fileName);
		nm.fileOpen(fileName);
		
		
	}
	
	
	
	
	
	
	
	
	
}
