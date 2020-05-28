package com.collection.listSilsub.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.listSilsub.model.Car;

public class ParkingTowerManager {

	
	private ArrayList<Car> carList = new ArrayList<>();
	
	//기본생성자
	public ParkingTowerManager() {}
	
	
	//기능
	public void insertCar(Car car) {

		int lastNo = 0;
		
		try {
			lastNo = carList.get(carList.size()-1).getParkingNum() +1;
			car.setParkingNum(lastNo);
		}catch(ArrayIndexOutOfBoundsException e) {
			lastNo=1;
			car.setParkingNum(lastNo);
		}
		carList.add(car);

		
	}
	public ArrayList<Car> selectList(){
		if(carList.isEmpty()) {
			return null;
		}else {
			return carList;
		}
		
	}
	
	public void outCar(String str) {
		
		char answer=' ';
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<carList.size();i++) {
			
			if((carList.get(i).getOwner()).equals(str)){
				System.out.println(carList.get(i));
				System.out.print("차량을 출차 하시겠습니까?(y/n) : ");
				answer=sc.next().toLowerCase().charAt(0);
				if(answer=='y') {
					carList.remove(i);
					System.out.println(str+"님의 차량이 출차되었습니다.");
				}
				
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
}
