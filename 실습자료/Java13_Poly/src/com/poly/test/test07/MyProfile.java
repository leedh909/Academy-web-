package com.poly.test.test07;

public class MyProfile extends Profile implements Display, Job{

	private String loc;
	
	//생성자
	public MyProfile() {}
	public MyProfile(String name, String phone) {
		super(name,phone);
	}
		
	//추상 메소드
	@Override
	public void jobLoc(String loc) {
	
		this.loc =loc;
		
	}

	@Override
	public void display() {
		
		super.printProfile();
		System.out.println("회사 주소: "+loc);
		System.out.println("회사 직종: "+jobId);
	}

	
	
	
	
	
	
	
	
	
	
}
