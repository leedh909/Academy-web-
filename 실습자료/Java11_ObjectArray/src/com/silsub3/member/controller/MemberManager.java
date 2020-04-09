package com.silsub3.member.controller;

import java.util.Scanner;

import com.silsub3.member.model.vo.Member;

public class MemberManager {

	private Member[] mb = null;
	Scanner sc = new Scanner(System.in);
	public static final int SIZE=10;
	private int memberCount=0;
	
	public MemberManager() {
		mb= new Member[SIZE];
		for(int i=0;i<mb.length;i++) {
			mb[i] = new Member();
		}
	}
	
	
	
	
	public void memberInput() {
		System.out.println("*****데이터를 입력하세요*****");
		System.out.println();
		System.out.println("회원 ID: ");
		String id =sc.next();
		System.out.println("회원 이름: ");
		String name =sc.next();
		System.out.println("회원 password: ");
		String password =sc.next();
		System.out.println("회원 email: ");
		String email =sc.next();
		System.out.println("회원 성별: ");
		char gender = sc.next().charAt(0);
		System.out.println("회원 나이: ");
		int age = sc.nextInt();
		mb[memberCount]=new Member(id,name,password,email,gender,age);
		memberCount++;
	}



	public void deleteMember() {
		
		
	}



	public void printAllMember() {
		if(memberCount==0) {
			System.out.println("회원이 없습니다.");
		}else {
			for(int i =0;i<memberCount;i++) {
				System.out.println(mb[i].memberInfo());
			}
		}
	}



	public int searchMemberId(String id) {
		
		int find=-1;
		for(int i=0;i<memberCount;i++) {
			if(id.equals(mb[i].getId())) {
				find=i;
			}	
		}
		if(find != -1) {
			return find;
		}else {
			return -1;
		}
		
		
	}



	public int searchMemberName(String name) {
		int find=-1;
		for(int i=0;i<memberCount;i++) {
			if(name.equals(mb[i].getName())) {
				find=i;
			}	
		}
		if(find != -1) {
			return find;
		}else {
			return -1;
		}
	}



	public int searchMemberEmail(String email) {
		int find=-1;
		for(int i=0;i<memberCount;i++) {
			if(email.equals(mb[i].getEmail())) {
				find=i;
			}	
		}
		if(find != -1) {
			return find;
		}else {
			return -1;
		}		
	}



	public void sortIDAsc() {
		// TODO Auto-generated method stub
		
	}



	public void sortIDDes() {
		// TODO Auto-generated method stub
		
	}



	public void sortAgeAsc() {
		// TODO Auto-generated method stub
		
	}



	public void sortAgeDes() {
		// TODO Auto-generated method stub
		
	}



	public void sortGenderDes() {
		// TODO Auto-generated method stub
		
	}




	public void printMember(int index) {
		System.out.println(mb[index].memberInfo());
	}
	
	
	
	
	
	
	
	
}
