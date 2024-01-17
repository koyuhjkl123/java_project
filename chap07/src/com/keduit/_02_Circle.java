package com.keduit;

public class _02_Circle extends _01_Shape{
	// _02_Circle 자식클래스
	
	int radius;
	
	public _02_Circle(int radius) {
		this.radius = radius;
	}
	@Override
	void draw() { 
		// 부모의 추상메소드를 자식클래스에서 반드시 구현
		// 오버라이딩
		System.out.println("원을 그립니다.");
		
	}
	@Override
	public double findArea() {
		// 부모클래스의 메소드를 선언
		// 자식클래스에서 오버라이딩으로 값을 재정의
		return pi * radius * radius;
	}

	
	
	
}
