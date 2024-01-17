package com.keduits;

public class Exam06 {
	private double e1;
	private double e2;
	
	
	Exam06(double e1){ // 매개변수 1개인 Exam06 클래스 생성자
		this.e1 = e1;
	}
	Exam06(double e1, double e2){// 매개변수 2개인 Exam06 클래스 생성자
		this.e1 = e1;
		this.e2 = e2;
	}
	
	void print() {
		
		System.out.println(e1 + " + " + e2 + "i");
	}
}
