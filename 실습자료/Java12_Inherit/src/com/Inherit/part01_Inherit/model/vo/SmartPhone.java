package com.Inherit.part01_Inherit.model.vo;

import java.util.Date;

public class SmartPhone extends Computer{

	private String mobileAgency;
	
	//생성자
	public SmartPhone() {}

	public SmartPhone(String mobileAgency) {
		super();
		this.mobileAgency = mobileAgency;
	}
	public SmartPhone(String brand,String productNumber, String productCode, String productName, int price, Date date,String cpu, int hdd, int ram, String os,String mobileAgency) {
		super(brand,productNumber,productCode,productName,price,date,cpu,hdd,ram,os);
		this.mobileAgency = mobileAgency;
	}
	
	//getter & setter
	public String getMobileAgency() {
		return mobileAgency;
	}
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency =mobileAgency;
	}
	
	@Override
	public String prnInfo() {
		return super.prnInfo()+", "+this.mobileAgency;
	}
	
	
	
	
	
	
	
	
}
