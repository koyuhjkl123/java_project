package com.keduit;

public abstract class _01_Shape { // 추상 클래스 abstract 선언부만 있는
	
	
	double pi = 3.14; // 더블타입 필드
	abstract void draw(); // 추상 메소드 선언부 | 구현부는 자식클래스에서
	
	public double findArea() { // 인스턴스 메소드
		return 0.0; // 더블형 타입으로 반환
	}

}
