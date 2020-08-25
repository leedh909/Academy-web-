package com.test07;

public class LgTV implements TV{

	public LgTV() {
		System.out.println("lg tv 생성");
	}
	
	@Override
	public void tvon() {
		System.out.println("lg tv on");
	}

	@Override
	public void tvoff() {
		System.out.println("lg tv off");
	}

	@Override
	public void volup() {
		System.out.println("lg tv vol up");
	}

	@Override
	public void voldown() {
		System.out.println("lg tv vol down");
	}
	
}
