package com.Inherit.silsub0;

public class SUV extends Car{

	//기본생성자
	public SUV() { System.out.println("suv 생성");}
	//매개변수 생성자
	public SUV(String color) {
		super(color);
		System.out.println(color+"색의 SUV 차량입니다.");
	}
	
	
	
	@Override
	public void accelPedal() {
		
		System.out.println("속도가 적당히 올라갑니다.");
		super.setSpeed(super.getSpeed()+15);
		
	}
	
	@Override
	public void breakPedal() {
		
		super.setSpeed(super.getSpeed()-15);
		if(super.getSpeed()>0) {
			System.out.println("속도가 적당히 줄어듭니다.");
		}else {
			System.out.println("멈췄습니다.");
			super.setSpeed(0);
		}
		
		
	}
	
	@Override
	public String toString() {
		return "suv의 현재속도는 "+getSpeed()+" 입니다.";
	}
	
	
	
	
	
}
