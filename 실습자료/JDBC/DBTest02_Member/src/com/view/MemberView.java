package com.view;

import java.util.List;
import java.util.Scanner;

import com.biz.MemberBizImpl;
import com.dto.Member;

public class MemberView {
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static int getMenu() {
		
		int select = 0;
		
		System.out.println("***************");
		System.out.println("1. selectAll");
		System.out.println("2. selectOne");
		System.out.println("3. insert");
		System.out.println("4. update");
		System.out.println("5. delete");
		System.out.println("6. exit");
		System.out.println("***************");
		System.out.print("input select: ");
		select = sc.nextInt();
		return select;
	}
	
	
	
	public static void main(String[] args) {
		int select = 0;
		MemberBizImpl memberBiz = new MemberBizImpl();
		
		while(select != 6) {
			
			select = getMenu();
			switch(select) {
			case 1://전체출력
				List<Member> res = memberBiz.selectAll();
				
				for(Member m:res) {
					System.out.println(m);
				}
				break;
			case 2://선택 출력
				System.out.print("번호 선택: ");
				int n = sc.nextInt();
				Member resOne = memberBiz.selectOne(n);
				System.out.println(resOne);
				break;
			case 3://추가
				System.out.print("번호 입력: ");
				int mno = sc.nextInt();
				System.out.print("이름 입력: ");
				String name = sc.next();
				System.out.print("나이 입력: ");
				int age = sc.nextInt();
				System.out.print("성별(M,F) 입력: ");
				String gender = sc.next();
				System.out.print("지역 입력: ");
				String location = sc.next();
				System.out.print("직업 입력: ");
				String job = sc.next();
				System.out.print("전화번호 입력: ");
				String tell = sc.next();
				System.out.print("이메일 입력: ");
				String email = sc.next();
		
				Member m = new Member(mno, name, age, gender, location, job, tell, email);
				
				int res_insert = memberBiz.insert(m);
				if(res_insert>0) {
					System.out.println("추가 성공!!");
				}else {
					System.out.println("추가 실패!!");
				}
				break;		
			case 4://수정
				System.out.print("수정할 번호: ");
				mno = sc.nextInt();
				System.out.print("이름 입력: ");
				name = sc.next();
				System.out.print("나이 입력: ");
				age = sc.nextInt();
				System.out.print("성별(M,F) 입력: ");
				gender = sc.next();
				System.out.print("지역 입력: ");
				location = sc.next();
				System.out.print("직업 입력: ");
				job = sc.next();
				System.out.print("전화번호 입력: ");
				tell = sc.next();
				System.out.print("이메일 입력: ");
				email = sc.next();
				
				m = new Member(mno, name, age, gender, location, job, tell, email);
				
				int res_update = memberBiz.update(m);
				if(res_update>0) {
					System.out.println("수정 성공!!");
				}else {
					System.out.println("수정 실패!!");
				}
				break;
			case 5://삭제
				System.out.print("삭제할 번호: ");
				int del_no = sc.nextInt();
				
				int res_del = memberBiz.delete(del_no);
				if(res_del>0) {
					System.out.println("삭제 성공!!!");
				}else {
					System.out.println("삭제 실패!!!");
				}
				break;
			case 6://종료
				System.out.println("시스템 종료");
				
			}
			
			
			
		}
		
		
		
		
		
	}
}
