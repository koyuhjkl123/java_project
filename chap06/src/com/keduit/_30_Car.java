package com.keduit;

public class _30_Car extends _29_Vehicle{ // _30_Car 자식 클래스

	String name = "자동차";
	
	void whoami() { // 자식 클래스 오버라이딩 된 메서드
		System.out.println("나는 자동차입니다.");
	}
	
	static void monve() { // static 정적 메소드
		System.out.println("달립니다.");
	}
}
