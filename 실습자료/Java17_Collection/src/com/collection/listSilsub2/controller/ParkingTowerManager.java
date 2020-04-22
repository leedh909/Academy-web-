package com.collection.listSilsub2.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.listSilsub2.model.Car;

public class ParkingTowerManager {

	private HashMap<Integer, Car> carMap = new HashMap<>();
	private int parkingNo=0;
	
	//기본생성자
	public ParkingTowerManager() {}
	
	//기능
	public void insertCar(Car car) {
		
		carMap.put(parkingNo, car);
		parkingNo++;

	}
	public Map<Integer, Car> selectMap(){
		
		return carMap;
	}
	public int deleteCar(int carNum) {
		
//		Set<Map.Entry<Integer, Car>> set = carMap.entrySet(); 
//		
//		for(Map.Entry<Integer, Car> entry :set) {
//			Car car = entry.getValue();
//			int num = entry.getKey();
//			if(car.getCarNum()==carNum) {
//				carMap.remove(num);
//				return 1;
//			}
//				
//		}
//		return 0;
		
		for(Map.Entry<Integer, Car> entry : carMap.entrySet()) {
			Car car = entry.getValue();
			int num = entry.getKey();
			if(car.getCarNum()==carNum) {
				carMap.remove(num);
				return 1;
			}
		}
		return 0;
	}
	public Map<Integer, Car> searchCar(String owner){
		
		Map<Integer,Car> searchMap = new HashMap<>();
		
		Set<Map.Entry<Integer, Car>> set = carMap.entrySet();
		Iterator<Map.Entry<Integer, Car>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Car> entry = it.next();
			Car car = entry.getValue();
			int num = entry.getKey();
			if(car.getOwner().equals(owner)) {
				searchMap.put(num, car);
			}
			
			
		}
		
		
		return searchMap;
	}
}

















