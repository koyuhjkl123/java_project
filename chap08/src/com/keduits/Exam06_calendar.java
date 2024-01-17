package com.keduits;

import java.util.Calendar;
import java.util.Date;

public class Exam06_calendar {

	String[] noonum = { "오전", "오후" };
	Date n1 = new Date();

//	calendar 선언
	Calendar c1 = Calendar.getInstance();

//	필드 날짜 선언
	int year = c1.get(Calendar.YEAR); // 년도
	int month = c1.get(Calendar.MONTH) + 1; // 월
	int day = c1.get(Calendar.DAY_OF_MONTH); // 일
	String week = noonum[c1.get(Calendar.AM_PM)];
//	Calendar.AM_PM = 오전 : 0 오후 : 1
//	오전 이라면 week[0] = "오전" 반환
//	오후 이라면 week[1] = "오후" 반환

//	필드 시간 선언
	int hour = c1.get(Calendar.HOUR); // 시간
	int minute = c1.get(Calendar.MINUTE); // 분
	int second = c1.get(Calendar.SECOND);// 초

//	필드 2023년 총 몇일인지 
//	2023년 1월 1일 ~ 2023년 12월 21일 기준으로 총 355 반환
	int day_of_month = c1.get(Calendar.DAY_OF_YEAR);

//	메소드 선언
	void show() {
		System.out.print(year + ".");
		System.out.print(month + ".");
		System.out.print(day + " ");
		System.out.print(week + " ");

		System.out.print(hour + ":");
		System.out.print(minute + ":");
		System.out.print(second+"\n");

		System.out.println("오늘은 " + month + "월의 " + day + "번째 날");
		System.out.println("오늘은 " + year + "년의 " + day_of_month + "번째 날");
	}

}
