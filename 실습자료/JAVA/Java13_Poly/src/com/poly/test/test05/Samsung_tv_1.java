package com.poly.test.test05;

public class Samsung_tv_1 implements Tv{

	//강사님 코딩
	private int volumn=0;
	
	public Samsung_tv_1() {
		System.out.println("Samsung tv가 켜졌습니다.");
	}
	
	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	@Override
	public int volumnUp() {
		setVolumn(getVolumn()+3);	
		return getVolumn();
	}

	@Override
	public int volumnDown() {
		setVolumn(getVolumn()-3);	
		return getVolumn();
		
	}
	
	public void tvClosed() {
		System.out.println("Samsung tv가 꺼졌습니다.");
	}

}
