package com.test07;

public class SamsungTV implements TV{

	public SamsungTV() {
		System.out.println("samsung tv 생성");
	}
	@Override
	public void tvon() {
		System.out.println("samsung tv on");
	}

	@Override
	public void tvoff() {
		System.out.println("samsung tv off");
	}

	@Override
	public void volup() {
		System.out.println("samsung tv vol up");
	}

	@Override
	public void voldown() {
		System.out.println("samsung tv vol down");
	}

	
}
