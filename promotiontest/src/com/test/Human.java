package com.test;

import java.util.Scanner;

class Humans {
	// 필드,
	Scanner s= new Scanner(System.in);
	private String name;
	private int year;
	private int month;
	private String date;
	private static String teString; // 클래스변수

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getyear() {
		return year;
	}

	public void setyear(int year) {
		
		if(year < 0) {
			year = 0;
			System.out.println("음수를 입력하셨습니다. 다시 입력바랍니다.");
			year = s.nextInt();
			this.year = year;
			return;
		}
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if(month > 0 && month <= 12) {
			this.month = month;
		}else {
			System.out.println("잘못된 정보를 입력하셨습니다.");
		}
		
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public static void TeString(String teStrin) {
		teString = teStrin;
	}
	public Humans(String name, int year, int month, String date) {
		setname(name);
		setyear(year);
		setMonth(month);
		setDate(date);
	}
	
	void showHumansInfo() {
		System.out.println(getname()+"의 생년월일");
		System.out.println(getyear()+"년 " + getMonth()+"월 "+getDate()+"일");
	}
}
public class Human{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Humans msHumans = new Humans("홍길동", -23, 8, "25");
		
		System.out.println(msHumans);
		msHumans.showHumansInfo();
		Humans.TeString("s");
		msHumans.setname("김진수");
		msHumans.setyear(25);
		msHumans.setMonth(12);
		msHumans.setDate("08");
		System.out.println(msHumans);
		msHumans.showHumansInfo();
	}
	
}

