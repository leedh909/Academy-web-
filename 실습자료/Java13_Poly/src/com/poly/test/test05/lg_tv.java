package com.poly.test.test05;

public class lg_tv implements Tv{

	private int volumn=0;
	
	//생성자
	public lg_tv(){
		System.out.println("lg_tv가 켜졌습니다.");
	}
	
	//getter & setter
	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	
	//추가 메소드
	public void tvClosed() {
		System.out.println("lg_tv가 꺼졌습니다.");
		setVolumn(0);
	}
	
	
	
	//상속 받은 메소드
	@Override
	public int volumnUp() {
		setVolumn(getVolumn()+1);
		System.out.println("볼륨이 1 증가하였습니다. 현재볼륨: "+getVolumn());
		return 0;
	}

	@Override
	public int volumnDown() {

		
		if(this.volumn>0) {
			setVolumn(getVolumn()-1);
			System.out.println("볼륨이 1 감소하였습니다. 현재볼륨: "+getVolumn());
			if(getVolumn()==0) {
				System.out.println("현재볼륨이 0 입니다.");
			}
			return 0;
			
		}else {
			setVolumn(0);
			System.out.println("현재볼륨이 0 입니다. 현재볼륨: "+getVolumn());
			return 0;
		}
		
		
		
	}

}
