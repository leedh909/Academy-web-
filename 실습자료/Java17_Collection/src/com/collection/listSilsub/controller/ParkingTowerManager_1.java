package com.collection.listSilsub.controller;

import java.util.ArrayList;
import java.util.List;

import com.collection.listSilsub.model.Car_1;

public class ParkingTowerManager_1 {

	private List<Car_1> carList = new ArrayList<>();
	//주차 차량의 모든 데이터가 담기는 carList
	
	
	
	
	public void insert(Car_1 car) {
		
		int lastNo=0;
		
		try {
			lastNo = carList.get(carList.size()-1).getParkingNum()+1;
		
		}catch(ArrayIndexOutOfBoundsException e) {
			lastNo=1;
		}
		
		car.setParkingNum(lastNo);
		carList.add(car);
		
		
	}




	public List<Car_1> selectList() {
		
		return carList;
	}




	public int deleteCar(int carNum) {

		Car_1 del = null;
		
		for(int i=0;i<carList.size();i++) {
			
			if(carList.get(i).getCarNum()==carNum) {
				del = carList.remove(i);
			}
		}
		
		if(del !=null) {
			return 1;
		}else {
			return 0;			
		}
		
	}




	public List<Car_1> searchCar(String owner) {
		
		List<Car_1> searchList = new ArrayList<>();
		
		for(int i=0; i<carList.size();i++) {
			if(carList.get(i).getOwner().equals(owner)) {
				searchList.add(carList.get(i));
			}
		}

		return searchList;
	}
	
	
	
	

	
	
}
