package com.keduit;

public class _04_AbstractTest {

	public static void main(String[] args) {
		
//		_01_Shape shape = new _01_Shape(); // 추상 클래스라 안됨
		
		_02_Circle circle = new _02_Circle(10);
		_03_Ractangle ract = new _03_Ractangle(3, 4);
		
		circle.draw(); // Circle 자식 클래스의 메소드 호출
		System.out.printf("원의 넓이는 %.1f%n",circle.findArea()); 
		
		ract.draw(); // Ractangle 자식 클래스의 메소드 호출
		System.out.printf("사각형의 넓이는 %.1f%n", ract.findArea());

	}

}
