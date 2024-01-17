package com.deduit;

import java.util.Calendar;

public class _25_WeekTest {

	public static void main(String[] args) {
		
		_24_Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1: 
			today = _24_Week.SUNDAY;
			break;
		case 2:
			today = _24_Week.MONDAY;
			break;
		case 3:
			today = _24_Week.TUESDAY;
			break;
		case 4:
			today = _24_Week.WEDESDAY;
			break;
		case 5:
			today = _24_Week.THURSDAY;
			break;
		case 6:
			today = _24_Week.FRIDAY;
			break;
		case 7:
			today = _24_Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘의 요일: " + today);
		
		
		if(today == _24_Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}

}
