package com.keduit;

public class _07_Circle {
	
	private double radius;
	private String color;
	
	
	
	public _07_Circle() {
		radius = 10.0; // 인스턴스의 값을 초기화
		color = "레드";
	}
	
	public _07_Circle(double radius) {
//		this(); // public _07_Circle() { < 불러옴
		this.radius = radius;
	}
	
	public _07_Circle(String color) {
		this(20.0, color); // 같은 클래스인 다른 생성자를 호출한다.
		this.color = color;
	}
	
	public _07_Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public void print() {
		System.out.println("반지름 : " + radius + " 색상 : " + color);
	}

}
