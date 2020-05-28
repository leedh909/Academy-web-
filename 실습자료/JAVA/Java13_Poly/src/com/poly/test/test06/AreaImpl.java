package com.poly.test.test06;

public abstract class AreaImpl implements Area{

	private String res;
	
	//상속 메소드 오버라이딩
	@Override
	public void print() {
		System.out.println(Area.print+res);
	}

	@Override
	public abstract void make();

	public void setRes(String res) {
		this.res = res;
	}
	
	
	
	
}
