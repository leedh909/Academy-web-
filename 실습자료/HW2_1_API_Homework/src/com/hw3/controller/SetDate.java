package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SetDate {

	public String todayPrint() {
		Calendar today = Calendar.getInstance();

		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		return year + "�� " + month + "�� " + date + "�� " + hour + "�� " + minute + "�� " + second+ "�� ";
	}
	
	public String setDay() {
		Calendar setTime = Calendar.getInstance();
		setTime.set(2011, 3-1, 21);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
		
		return sdf.format(setTime.getTime());
	}
}
