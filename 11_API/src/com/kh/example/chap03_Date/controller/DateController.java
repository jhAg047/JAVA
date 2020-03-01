package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		//현재시간
		Date today = new Date();
		System.out.println(today);
		
		//1970년 1월 1일 0시 0분 0초 이후로 흐른 시간을 가져올ㅍ때
		System.out.println(today.getTime());
		Date time = new Date(1578917305075L);
		System.out.println(time);
		
		//1970년 1월 1일 9시 출력
		Date origin = new Date(0);
		System.out.println(origin);
		
//		Date date = new Date(2020,1,13);
		//The constructor Date(int, int, int) is deprecated
		//이 생성자는 더이상 사용하지않는게 좋겠다!
	}
	public void method2() {
//		Calendar c = new Calendar(); //추상클래스인데 객체 생성하려고 해서 오류
		//현재시간에 대한 정보 (근데 우리가 원하는 방식X)
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		//month -zero index 기반 그래서 +1 해줘야함
		int month = c.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm); //오전은 0, 오후는 1
		
		//12시 기준
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		//24시 기준
		hour = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min);
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec);
		
	}
	public void method3() {
		// GregorianCalendar는 특정 날짜 값을 입력해서 객체 생성하는 기능 제공
		// 2020.6.17
		int year = 2020;
		int month = 5;// index 기준이라서 -1해야함
		int date = 17;
		int hour = 22;
		int min = 0;
		int sec = 0;
		
		GregorianCalendar gc = new GregorianCalendar(year,month,date,hour,min,sec);
		long time = gc.getTimeInMillis();
		Date endDay = new Date(time);
		System.out.println(endDay);
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH)+1);
		System.out.println(gc.get(Calendar.DATE));
		
		//2020-06-17 수요일 오후 22시 00분 00초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 a HH시 mm분 ss초");
		String fmt = sdf.format(endDay);
		System.out.println(fmt);
	}
}
