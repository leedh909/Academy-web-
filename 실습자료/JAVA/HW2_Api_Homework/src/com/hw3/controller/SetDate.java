package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SetDate {

	public SetDate() {}
	
	
	//2018년 12월 28일 5시 20분 20초
	//2011년 03월 21일 월요일
	public String todayPrint() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2018, 12-1, 28, 5, 20, 20);	
		
		int year = calendar.get(1);
		int month = calendar.get(calendar.MONTH)+1;
		int date = calendar.get(calendar.DATE);
		int hour = calendar.get(calendar.HOUR);
		int min = calendar.get(calendar.MINUTE);
		int sec = calendar.get(calendar.SECOND);
		
		
		
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 h시 mm분 dd초");
//		System.out.println(sdf1.format(calendar.getTime()));
		
		
		return year+"년 "+month+"월 "+date+"일 "+hour+"시 "+min+"분 "+sec+"초";
	}
	
	public String setDay() {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2011, 3-1, 21);
		
		String[] weekDay = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		int year = calendar.get(1);
		int month = calendar.get(calendar.MONTH)+1;
		int date = calendar.get(calendar.DATE);
		int day = calendar.get(calendar.DAY_OF_WEEK);
		
		
		return year+"년 "+month+"월 "+date+"일 "+weekDay[day-1];
	}
	
	
	
	
	
	
}
