package com.silsub2.student.controller;

import java.util.Scanner;

import com.silsub2.person.model.vo.Person;
import com.silsub2.student.model.vo.Student;

public class TestStudentArray {

	public static void main(String[] args) {

		Student[] st = new Student[10];
		Scanner sc = new Scanner(System.in);
		
		char answer =' ';
		int count=0; //학생 수
		
		while(true) {
			
			System.out.println(count+"번째 입력--------------");
			System.out.print("학년: ");
			int grade = sc.nextInt();
			System.out.print("반: ");
			int classroom = sc.nextInt();
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("국어점수: ");
			int kor = sc.nextInt();
			System.out.print("영어점수: ");
			int eng = sc.nextInt();
			System.out.print("수학점수: ");
			int mat = sc.nextInt();
			System.out.println("---------------------");
				
			st[count]= new Student(grade,classroom,name,kor,eng,mat);
					
			System.out.print("계속 추가하시겠습니까?(y/n): ");
			answer=sc.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				count++;
				continue;
			}else {
				for(int i=count+1; i<st.length;i++) {
					st[i]=new Student();
				}
				break;
			}
		}
		
		int ksum=0;
		int esum=0;
		int msum=0;
		
		for(int i=0;i<st.length;i++) {
			if(st[i].getName() == null) {
				continue;
			}else {
				ksum+=st[i].getKor();
				esum+=st[i].getEng();
				msum+=st[i].getMat();
			}
			
		}
		
		System.out.printf("%d명의 국어점수 평균: %d, 영어점수 평균: %d, 수학점수 평균: %d \n",count+1,(ksum/(count+1)),(esum/(count+1)),(msum/(count+1)));
		
		for(int i=0; i<st.length;i++) {
			if(st[i].getName() == null) {
				continue;
			}else {
				System.out.println(st[i].prnInfo());
			}
			
		}
		
	}

}
