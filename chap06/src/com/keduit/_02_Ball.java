package com.keduit;

public class _02_Ball extends _01_Circle {

	private String color;

	public _02_Ball(String color) {
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + "자식 클래스의 Color");
	}

	public void findVolume() {
		System.out.println("부피는 4/3*(파이*반지름*반지름)이다.");
	}

	@Override   // 컴파일러에게 오버라이딩 할꺼야 알려주는 에너테이션
	public void findArea() { // 오버라이딩 출력값만 변경된것이 오버라이딩 / 재정의
		
		findRadius();
		super.findArea();
		System.out.println("넓이는 4*(π *반지름*반지름)");
	}

}
