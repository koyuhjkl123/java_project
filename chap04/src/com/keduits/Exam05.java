package com.keduits;

public class Exam05 {
	
	private int number;
	
	public Exam05(int number) { // 생성자
		this.number = number;
	}
	
	public boolean isSamLine(Exam05 x) { // 같은지 확인 하는 메소드
		
		// 
		if(this.number == x.number) {
			return true;
		}else {
			return false;
		}
	}
}
