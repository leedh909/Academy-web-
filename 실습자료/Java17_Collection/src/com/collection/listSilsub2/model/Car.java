package com.collection.listSilsub2.model;

public class Car {

	private int carNum;
	private int carType;
	private String owner;
	
	//생성자(기본, 매개변수)
	public Car() {}
	public Car(int carNum, int carType, String owner) {
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}
	
	//getter & setter
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public int getCarType() {
		return carType;
	}
	public void setCarType(int carType) {
		this.carType = carType;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	@Override
	public String toString() {
		
		String str ="";
		switch(carType) {
		case 1: str="경차"; break;
		case 2: str="세단"; break;
		case 3: str="SUV"; break;
		case 4: str="트럭"; break;		
		}
		
		
		
		return "Car [차량번호=" + carNum + ", 차량종류=" + str + ", 소유주=" + owner + "]";
	}
	
	
	
	
	
}
