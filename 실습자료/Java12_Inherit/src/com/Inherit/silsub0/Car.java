package com.Inherit.silsub0;

public class Car {

	private String color;
	private int speed;
	
	//생성자
	public Car() {}
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	
	//getter & setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	//추가 기능 메소드
	public void accelPedal() {
		
		System.out.println("속도가 올라갑니다.");
		setSpeed(getSpeed()+10);
		
	}
	public void breakPedal() {
		
		setSpeed(getSpeed()-10);
		
		if(getSpeed()>0) {
			System.out.println("속도가 줄어듭니다.");
		}else {
			System.out.println("정지하였습니다.");
			setSpeed(0);
		}
		
	}
	
	@Override
	public String toString() {
		return "현재속도는 "+speed+" 입니다.";
	}
	
	
	
	
	public String prninfo() {
		return this.color+", "+this.speed;
	}
	
	
	
	
	
	
	
	
	
	
}
