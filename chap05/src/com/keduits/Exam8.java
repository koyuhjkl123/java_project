package com.keduits;

public enum Exam8 {

	MONDAY("싫다"), 
	TUESDAY("그저 그렇다"), WEDESDAY("그저 그렇다"), THURSDAY("그저 그렇다"), 
	FRIDAY("좋다"), 
	SATURDAY("최고"), SUNDAY("최고");
	
	
	private String s; // 필드
	
	Exam8(String s){ // 생성자
		this.s = s;
	}

//	switch 문에서 toString 사용하기 위해 메서드 정의
	public String toString() {
		return s;
	}
}
