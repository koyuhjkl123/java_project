package com.keduits;

import java.util.Calendar;

public class Exam03_CalendarTest {
	

	public static void main(String[] args) {
		String[] weekName = { "일", "월", "화", "수", "목", "금", "토" };
		String[] nooName = { "오전", "오후" };

		Calendar c = Calendar.getInstance();
		
		

//		해당 년도
		int year = c.get(Calendar.YEAR);
//		해당 월
		int month = c.get(Calendar.MONTH) + 1;
//		해당 일
		int day = c.get(Calendar.DAY_OF_MONTH);

//		해당 요일
//		일 = 1, 월 = 2, 화 = 3, 수 = 4, 목 = 5, 금 = 6, 토 = 7,
		int week = c.get(Calendar.DAY_OF_WEEK);
//		해당 오전이면 = 0을 반환 / 오후이면 = 1을 반환
		int noon = c.get(Calendar.AM_PM); 
	
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		

		System.out.println(year + "년 " + month + "월 " + day + "일");
//		weekName[week-1] : 배열 인덱스는 0부터 시작하기 때문에 -1를 줘야한다.
		System.out.println(weekName[week-1] + "요일 " + nooName[noon]);
		System.out.println(hour + "시 " + minute + "분 " + second + "초");

	}
}
