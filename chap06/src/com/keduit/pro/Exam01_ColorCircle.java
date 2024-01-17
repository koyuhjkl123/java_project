package com.keduit.pro;

public class Exam01_ColorCircle extends Exam01{

	String color;
	
	void show() {
		System.out.printf("반지름이 %d인 %s 원이다.", radius, color);
		
	}
	
	public Exam01_ColorCircle(int radius, String color) {
		super(radius); // 부모클래스인 radius 값을 가져오기 위해
		this.color = color; // color 필드인 값을 가져오기 위해
	}
}
