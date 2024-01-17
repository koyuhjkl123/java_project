package com.keduits;

public class Exam05_Tv extends Exam05_Controller{

	public Exam05_Tv(boolean power) {
		this.power = power;
	}
	@Override
	String getName() {
		
		if (power) {
			return "Tv가 켜졌습니다.";
		}else {
			return "Tv가 꺼져 있어 확인 되지 않습니다.";
		}
		
		
	}
	@Override
	void show() {
		if(power) {
			System.out.println("Tv가 켜졌습니다.");
		}else {
			System.out.println("Tv가 꺼졌습니다.");
		}
	}

}
