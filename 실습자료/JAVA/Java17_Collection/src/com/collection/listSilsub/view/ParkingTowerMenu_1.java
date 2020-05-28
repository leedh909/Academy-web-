package com.collection.listSilsub.view;

import java.util.List;
import java.util.Scanner;

import com.collection.listSilsub.controller.ParkingTowerManager_1;
import com.collection.listSilsub.model.Car_1;

public class ParkingTowerMenu_1 {
	
	Scanner sc = new Scanner(System.in);
	private ParkingTowerManager_1 ptm = new ParkingTowerManager_1();
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("===주차타워관리===");
			System.out.println("1. 차량 주차");
			System.out.println("2. 전체 출력");
			System.out.println("3. 차량 출차");
			System.out.println("4. 차량 검색");
			System.out.println("0. 끝내기");
			System.out.println("-----------------");
			System.out.print("메뉴 선택: ");
			int num = sc.nextInt();
			
			
			switch(num) {
			case 1: insertCar(); break;
			case 2: selectList(); break;
			case 3: deleteCar(); break;
			case 4: searchCar(); break;
			case 0: System.out.println("프로그램 종료"); return;
			default: System.out.println("잘못입력!");
			}
		
		}
		

	}
	
	public void insertCar() {
		System.out.print("차량 번호: ");
		int carNum = sc.nextInt();
		
		System.out.print("차량타입(1.경차/2.세단/3.SUV/4.트럭): ");
		int carType = sc.nextInt();
		sc.nextLine();      // nextInt()는 enter, 띄어쓰기 값들을 신경안쓴다. 그러나 바로 다음 nextLine()이 버퍼에 남아있는 enter,띄어쓰기 값들을 받아와서 그냥 넘어가는 것이다.
		
		System.out.print("차주: ");
		String owner = sc.nextLine();
		
		Car_1 car = new Car_1(carNum, carType, owner);
		
		ptm.insert(car);
		
		
	}
	public void selectList() {
		
		List<Car_1> searchList = ptm.selectList();
		
		if(searchList.size()==0) {
			System.out.println("주차된 차량이 없습니다.");
		}else {
			for(Car_1 c : searchList) {
				System.out.println(c.toString());
			}
		}

	}
	public void deleteCar() {
		
		System.out.print("차량 번호: ");
		int carNum = sc.nextInt();
		
		int res = ptm.deleteCar(carNum);
		
		if(res>0) {
			System.out.println("차량 출차 완료!");
		}else {
			System.out.println("입력하신 차량이 주차되어있지 않습니다.");
		}

	}
	public void searchCar() {
		
		System.out.print("주차 차량 검색(차주입력): ");
		sc.nextLine();
		String owner = sc.nextLine();
		
		List searchList = ptm.searchCar(owner);
		
		if(searchList.isEmpty()) {
			System.out.println("검색한 차량이 존재하지 않습니다.");
		}else {
			for(int i=0;i<searchList.size();i++) {
				System.out.println(searchList.get(i));
			}
		}
		
		
	}
	
	
	
}
