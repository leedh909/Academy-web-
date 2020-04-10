package com.poly.test.test05;

public class lg_tv_1 implements Tv{

	//강사님 코딩
	private int volumn=0;
	
	
	public lg_tv_1(){
		System.out.println("Lg tv가 켜졌습니다.");
	}
	
	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}	
	
	@Override
	public int volumnUp() {
		
		setVolumn(getVolumn()+1);	
		return getVolumn();
	}

	@Override
	public int volumnDown() {

		setVolumn(getVolumn()-1);	
		return getVolumn();
	}

	public void tvClosed() {
		System.out.println("Lg tv가 꺼졌습니다.");
	}
	
	
}
