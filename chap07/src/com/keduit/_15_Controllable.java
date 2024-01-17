package com.keduit;

public interface _15_Controllable {

//	디폴트 메소드
	default void repair() {
		show("장비를 수리합니다.");
	}
	
	// static 메소드
	static void reset() {
		System.out.println("장비를 초기화 합니다.");
	}
	
//	private 내부에서만 사용 가능한 메소드
	private void show(String s) {
		System.out.println(s);
	}
	
//	public abstract
	void turnOn();
	void turnOff();
}
