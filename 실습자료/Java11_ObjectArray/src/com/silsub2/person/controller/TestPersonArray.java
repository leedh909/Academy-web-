package com.silsub2.person.controller;

import java.util.Scanner;

import com.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {

		Person[] person = new Person[5];
		
		Scanner sc = new Scanner(System.in);
		
//		for(int i=0; i<person.length;i++) {
//			System.out.print("이름: ");
//			String name = sc.next();
//			System.out.print("나이: ");
//			int age = sc.nextInt();
//			System.out.print("성별: ");
//			char gender = sc.next().charAt(0);
//			System.out.print("키: ");
//			double height = sc.nextDouble();
//			System.out.print("몸무게: ");
//			double weight = sc.nextDouble();
//			
//			person[i]= new Person(name,age,gender,height,weight);
//			
//		}
		person[0] = new Person("일번",20,'남',180.5,78.2);
		person[1] = new Person("이번",21,'남',160.5,48.2);
		person[2] = new Person("삼번",22,'남',190.5,98.2);
		person[3] = new Person("사번",23,'여',170.4,58.5);
		person[4] = new Person("오번",24,'여',160.5,48);
		
		int sumage=0;
		double sumhei=0;
		double sumwei=0;
		
		for(int i=0;i<person.length;i++) {
			System.out.println(person[i].personInfo());
		}
		
		for(int i=0; i<person.length;i++) {
			
			sumage+=person[i].getAge();
			sumhei+=person[i].getHeight();
			sumwei+=person[i].getWeight();
		}
		
		System.out.printf("총원 %d명의 나이 평균 : %d, 키 평균: %.2f, 몸무게 평균: %.2f",person.length,sumage/person.length,sumhei/person.length,sumwei/person.length);
	}

}
