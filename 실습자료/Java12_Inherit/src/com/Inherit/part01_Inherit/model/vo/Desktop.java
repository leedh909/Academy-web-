package com.Inherit.part01_Inherit.model.vo;

import java.util.Date;

public class Desktop extends Computer{

	private boolean allInOne;
	
	//생성자
	public Desktop() {}	
	public Desktop(boolean allInOne) {
		super();
		this.allInOne = allInOne;
	}
	public Desktop(String brand,String productNumber, String productCode, String productName, int price, Date date,String cpu, int hdd, int ram, String os,boolean allInOne) {
		super(brand,productNumber,productCode,productName,price,date,cpu,hdd,ram,os);
		this.allInOne=allInOne;	
	}
	
	//getter & setter
	public boolean getAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	@Override
	public String prnInfo() {
		return super.prnInfo()+", "+this.allInOne;
	}
	
	
	
	
	
	
	
	
}
