package com.kediuts;

import java.util.Calendar;

public class Exam01_MyDate {

	int year;
	int month;
	int day;
	
	
	Calendar c = Calendar.getInstance();
	
	
	
	Exam01_MyDate(){
		this.year = c.get(Calendar.YEAR);
		this.month = c.get(Calendar.MONTH)+1;
		this.day = c.get(Calendar.DAY_OF_MONTH);
		
//		this.year = 2035;
//		this.month = 12;
//		this.day = 25;
	}
	Exam01_MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}

}
