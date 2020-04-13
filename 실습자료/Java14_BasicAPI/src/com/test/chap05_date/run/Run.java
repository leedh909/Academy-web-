package com.test.chap05_date.run;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Run {

	public static void main(String[] args) {

		//Date
//		Date originTime = new Date(0L);
//		Date originTime = new Date(1000L);
//		System.out.println(originTime);
		
		String originTime = new Date(0L).toGMTString();
		//지역 상관없이 그리니치 표준시로 나오게 하는 메소드
		System.out.println(originTime);
		
		Date today = new Date();
		System.out.println(today);
		
		//원하는 패턴으로 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(today));		
		
		System.out.println("----캘린더----");
		Calendar calendar = Calendar.getInstance();
		calendar.set(2020,4-1,13); // calendar에서 set할 때 , 월(month)만 빼기 1을 해줘야 한다.
		
		int year = calendar.get(1);
		int month = calendar.get(calendar.MONTH)+1; //calendar.get(calendar.MONTH)+1을 가져와야한다.
		int date = calendar.get(calendar.DATE);
		int hour = calendar.get(calendar.HOUR);
		int min = calendar.get(calendar.MINUTE);
		int sec = calendar.get(calendar.SECOND);
		
		System.out.println(year+"년 "+month+"월 "+date+"일");
		System.out.println(calendar);//출력시 toString 값 확인가능.
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:dd");
		System.out.println(sdf1.format(calendar.getTime()));
		
		
		Calendar cal = (Calendar)calendar.clone();
		//object라서 형변환 시켜줘야한다.
		cal.add(calendar.YEAR, -10); //add()메소드는 지정된 값에 값을 추가하거나 빼는 메소드이다.
		cal.add(calendar.MONTH,-2);
		cal.add(calendar.DATE,11);
		System.out.println(cal.getTime());
		System.out.println(sdf1.format(cal.getTime()));
		
		
		//타임존
		TimeZone tz = TimeZone.getTimeZone("Etc/Greenwich");
		sdf1.setTimeZone(tz);
		System.out.println(sdf1.format(calendar.getTime())); //시간을 확인해보면 다른걸 확인할 수 있다.
	
//		for(String name : TimeZone.getAvailableIDs()) { //나라별 
//			System.out.println(name);
//		}
		
		
		//
		System.out.println("------그레고리안-----");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());
		
		gc.set(2018, 9-1, 22);
		System.out.println(gc.getTime());
		
		
		
	}

}
