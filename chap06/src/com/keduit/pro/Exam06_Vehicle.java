package com.keduit.pro;

public class Exam06_Vehicle {
	
	String color;
	int speed;
	
	public Exam06_Vehicle(String color, int speed) {
		this.color = color; // 색상
		this.speed = speed; // 속도
		
	}
	
	void show() {
		System.out.println("자동차 색상 : " + color + " 자동차 속도 : " + speed);
	}



}
