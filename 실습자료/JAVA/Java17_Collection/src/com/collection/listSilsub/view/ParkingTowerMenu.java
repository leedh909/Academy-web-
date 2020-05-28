package com.collection.listSilsub.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.listSilsub.controller.ParkingTowerManager;
import com.collection.listSilsub.model.Car;

public class ParkingTowerMenu {

	Scanner sc = new Scanner(System.in);
	private ParkingTowerManager ptm = new ParkingTowerManager();
	
	//기본생성자
	public ParkingTowerMenu() {}
	
	//기능
	public void mainMenu() {
		
		do {
			System.out.println("======== *주차 타워 관리* ========");
			System.out.println();
			System.out.println("1. 차량 주차");
			System.out.println();
			System.out.println("2. 전체 출력");
			System.out.println();
			System.out.println("3. 차량 출차");
			System.out.println();
			System.out.println("0. 끝내기");
			System.out.println();
			System.out.print("메뉴 선택: ");
			int no = sc.nextInt();
			System.out.println();
			
			switch(no) {
			case 1: insertCar(); break;
			case 2: selectList(); break;
			case 3: outCar(); break;
			case 0: System.out.println("프로그램 종료"); return;
			default: System.out.println("입력값이 잘못 되었습니다.");
			}
			
		}while(true);
		
	}
	public void outCar() {
		
		System.out.print("출차 하실 분의 성함을 알려주세요: ");
		String str = sc.next();
		
		ptm.outCar(str);
		
		
		
	}
	public void insertCar() {
		
		System.out.print("차량번호: ");
		int carNum=sc.nextInt();
		System.out.print("차량종류 (1:경차 / 2:세단 / 3:SUV / 4:트럭) : ");
		int carType=sc.nextInt();
		System.out.print("차주이름: ");
		String owner=sc.next();
		
		Car car = new Car(carNum,carType,owner);
		
		ptm.insertCar(car);
		
		
	}
	public void selectList() {
		
		ArrayList carList = ptm.selectList();
		
		if(carList==null) {
			System.out.println("주차된 차량이 없습니다.");
			System.out.println();
		}else {
			System.out.println("***전체 리스트 목록 출력***");
			
			for(int i=0;i<carList.size();i++) {
				System.out.println(carList.get(i));
			}
			System.out.println();
		}
		
		
		
	}
	
	
}
