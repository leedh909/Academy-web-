package com.Inherit.silsub0;

public class SportsCar extends Car{

	//생성자
	public SportsCar() {
		super();
		System.out.println("sportscar 생성");
	}
	
	public SportsCar(String color) {
		super(color);
		System.out.println(color+"색 sportscar 생성");
	}
	
	//추가 메소드
	@Override
	public void accelPedal() {
		System.out.println("속도가 더 빨리 올라갑니다.");
		super.setSpeed(super.getSpeed()+30);
		
	}
	
	@Override
	public void breakPedal() {
		
		super.setSpeed(super.getSpeed()-30);
		if(super.getSpeed()>0) {
			System.out.println("속도가 더 빨리 줄어듭니다.");
		}else {
			System.out.println("멈췄습니다.");
			super.setSpeed(0);
		}	
		
	}
	
	@Override
	public String toString() {
		return "sportscar의 현재 속도는 "+getSpeed()+" 입니다.";
	}
	
	
	
	
	
	
	
}
