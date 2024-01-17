package com.keduit;

public class _03_Ractangle extends _01_Shape{

	int width;
	int height;
	
	
	public _03_Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	void draw() { // 추상 메소드(부모) -> 추상 메소드를 오버라이딩으로 재정의(자식)
		System.out.println("사각형을 그리다.");
	}
	
	@Override
	public double findArea() {
		// 부모클래스의 메소드를 오버라이딩으로 값을 재정의
		return width * height;
	}
}
