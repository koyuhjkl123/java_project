package com.keduistest;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨간색");
		
		System.out.println("원 :");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("\n공 :");
		c2.findRadius(); // Circle 클래스
		c2.findColor(); // Ball 클래스
		c2.findArea(); // Ball 클래스 오버라이딩 한 자식 메소드
//		c2.findarea(); // Circle 클래스
		c2.findVolume(); // Ball 클래스

	}

}
