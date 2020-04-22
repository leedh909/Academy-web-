package com.collection.listSilsub2.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.collection.listSilsub2.controller.ParkingTowerManager;
import com.collection.listSilsub2.model.Car;

public class ParkingTowerMenu {

	Scanner sc = new Scanner(System.in);
	private ParkingTowerManager ptm = new ParkingTowerManager();
	
	//기본 생성자
	public ParkingTowerMenu() {}
	
	
	//기능
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("========== 주차 타워 관리  ==========");
			System.out.println("1. 차량 주차");
			System.out.println("2. 전체 출력");
			System.out.println("3. 차량 출차");
			System.out.println("4. 주차 차량 검색");
			System.out.println("0. 끝내기");
			System.out.println("------------------");
			System.out.print("메뉴 선택: ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: insertCar(); break;
			case 2: selectMap(); break;
			case 3: deleteCar(); break;
			case 4: searchCar(); break;
			case 0: System.out.println("프로그램 종료"); return;
			default:
				System.out.println("잘못입력!!!!!!!");
			}			
		}
		
	}
	public void insertCar() {
		
		System.out.print("차량번호: ");
		int carNum = sc.nextInt();
		System.out.print("차량타입(1:경차/2:세단/3:SUV/4:트럭): ");
		int carType = sc.nextInt();
		sc.nextLine();
		System.out.print("차주: ");
		String owner = sc.nextLine();
		
		Car car = new Car(carNum, carType, owner);
		
		ptm.insertCar(car);
		
	}
	public void selectMap() {
		
		Set<Map.Entry<Integer,Car>> carMap = ptm.selectMap().entrySet();
		
		if(carMap.isEmpty()) {
			System.out.println("주차된 차량이 없습니다.");
		}else {
			
			for(Map.Entry<Integer, Car> entry : carMap) {
				
				Car car = entry.getValue();
				int key = entry.getKey();
				System.out.println(car);
			}
			
		}
		
		
	}
	public void deleteCar() {
		
		System.out.print("출차할 차량번호를 입력: ");
		int carNum = sc.nextInt();
		int res = ptm.deleteCar(carNum);
		
		if(res > 0) {
			System.out.println("차량 출차 완료!");
		}else {
			System.out.println("입력하신 차량이 주차되어 있지 않습니다.");
		}
		
		
	}
	public void searchCar() {
		
		Set<Map.Entry<Integer, Car>> searchMap = null;
		sc.nextLine();
		System.out.print("검색할 차주 이름: ");
		String owner = sc.nextLine();
		searchMap = ptm.searchCar(owner).entrySet();
		
		if(searchMap.isEmpty()) {
			System.out.println("검색한 차량이 주차 되어 있지 않습니다.");
		}else {
			
			for(Map.Entry<Integer, Car> entry : searchMap) {
				Car car = entry.getValue();
				int key = entry.getKey();
				System.out.println("검색결과 "+car);
				
				
			}
			
		}
		
		
	}
	
	
	
}
