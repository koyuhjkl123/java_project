package com.keduit;

public class _01_Circle {
	
	private void scret() {
		System.out.println("비밀");
	}
	
	protected void findRadius() { // 본인 클래스 자식 클래스
		System.out.println("본인과 자식클래스만 사용이 가능");
	}
	
	public void findArea() {
		System.out.println("넓이는 (파이 * 반지름 * 반지름");
	}

}
