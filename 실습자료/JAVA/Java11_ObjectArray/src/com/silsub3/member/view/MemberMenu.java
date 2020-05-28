package com.silsub3.member.view;

import java.util.Scanner;

import com.silsub3.member.controller.MemberManager;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberManager mManager = new MemberManager();
	
	public MemberMenu() {}
	
	//추가 메소드
	public void mainMenu() {
		
		char answer = ' ';
		do {
			System.out.println("***** 회원 관리 프로그램 *****");
			System.out.println();
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 정렬");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 선택: ");
			int choose = sc.nextInt();
			
			switch(choose) {
			case 1:
				mManager.memberInput();
				break;
			case 2:
				searchMenu();
				break;
			case 3:
				modifyMenu();
				break;
			case 4:
				sortMenu();
				break;
			case 5:
				mManager.deleteMember();
				break;
			case 6:
				mManager.printAllMember();
				break;
			case 9:
				System.out.print("정말로 끝내시겠습니까?(y/n): ");
				answer = sc.next().charAt(0);
				if(answer=='y'||answer=='Y') {
					return;
				}else {
					mainMenu();
				}
				
			default:
					System.out.println("잘못 입력했습니다.!!!");
				
			}
			
		}while(true);
	}
	public void searchMenu() {
		
		do {
			System.out.println("***** 회원 정보 검색 메뉴 *****");
			System.out.println();
			System.out.println("1. 아이디로 검색");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이메일로 검색");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택: ");
			int choose = sc.nextInt();
			int index=-1;
			switch(choose) {
			case 1:
				System.out.println("검색할 ID를 입력하시오.");
				String id = sc.next();
				index=mManager.searchMemberId(id);
				break;
			case 2:
				System.out.println("검색할 이름을 입력하시오.");
				String name = sc.next();
				index=mManager.searchMemberName(name);
				break;
			case 3:
				System.out.println("검색할 이메일을 입력하시오.");
				String email = sc.next();
				index=mManager.searchMemberEmail(email);
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			default:
				System.out.println("잘못 입력 하셨습니다.");

			}
			if(index>-1) {
				mManager.printMember(index);
			}
		
		}while(true);
		
		
	}
	public void sortMenu() {
		do {
			System.out.println("***** 회원 정보 정렬 출력 메뉴 *****");
			System.out.println();
			System.out.println("1. 아이디 오름차순 정렬 출력");
			System.out.println("2. 아이디 내림차순 정렬 출력");
			System.out.println("3. 나이 오름차순 정렬 출력");
			System.out.println("4. 나이 내림차순 정렬 출력");
			System.out.println("5. 성별 내림차순 정렬 출력(남여순)");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택: ");
			int choose = sc.nextInt();
			
			switch(choose) {
			case 1:
				mManager.sortIDAsc();
				break;
			case 2:
				mManager.sortIDDes();
				break;
			case 3:
				mManager.sortAgeAsc();
				break;
			case 4:
				mManager.sortAgeDes();
				break;
			case 5:
				mManager.sortGenderDes();
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			default:
				System.out.println("잘못 입력 하셨습니다.");

			}
		}while(true);
	}
	public void modifyMenu() {
		
		do {
			System.out.println("***** 회원 정보 수정 메뉴 *****");
			System.out.println();
			System.out.println("1. 암호 변경");
			System.out.println("2. 이메일 변경");
			System.out.println("3. 나이 변경");
			System.out.println("9. 이전 메뉴로 가기");
			System.out.print("메뉴 선택: ");
			int choose = sc.nextInt();
			int index =-1;
			switch(choose) {
			// 수정이 필요함.!!!!!!!!
			case 1:
				System.out.println("변경할 회원의 아이디: ");
				String id=sc.next();
				index=mManager.searchMemberId(id);
				if(index>-1) {
					mManager.printMember(index);
					System.out.println("변경할 암호 입력:");
					String password = sc.next();
					mManager.modifyMemberPassword(index,password);
				}else {
					System.out.println("입력하신 아이디가 없습니다.");
				}
				
				break;
			case 2:
				System.out.println("변경할 회원의 아이디: ");
				id=sc.next();
				index=mManager.searchMemberId(id);
				if(index>-1) {
					mManager.printMember(index);
					System.out.println("변경할 이메일 입력:");
					String email = sc.next();
					mManager.modifyMemberEmail(index,email);
				}else {
					System.out.println("입력하신 아이디가 없습니다.");
				}
				break;
			case 3:
				System.out.println("변경할 회원의 아이디: ");
				id=sc.next();
				index=mManager.searchMemberId(id);
				if(index>-1) {
					mManager.printMember(index);
					System.out.println("변경할 나이 입력:");
					int age = sc.nextInt();
					mManager.modifyMemberAge(index,age);
				}else {
					System.out.println("입력하신 아이디가 없습니다.");
				}
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			default:
				System.out.println("잘못 입력 하셨습니다.");

			}
			
		}while(true);
	}
	
	
}
