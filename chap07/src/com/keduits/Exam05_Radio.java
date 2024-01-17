package com.keduits;

public class Exam05_Radio extends Exam05_Controller{

	
	Exam05_Radio(boolean power){ // 생성자
		this.power = power; // 부모클래스로 부터 상속받은 필드
	}
	
	
	@Override // 추상 메서드를 자식클래스에서 재정의
	String getName() {
		if (power) {
			return "라디오가 켜졌습니다.";
		}else {
			return "라디오가 꺼졌습니다.";
		}
	}
	
	void show() {
		if(power) {
			System.out.println("라디오가 켜졌습니다.");
		}else {
			System.out.println("라디오가 꺼졌습니다.");
		}
		
	}
	
	
	

}
