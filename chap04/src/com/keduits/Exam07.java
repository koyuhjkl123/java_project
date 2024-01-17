package com.keduits;

public class Exam07 {

	private int number = 7;
	private String name; // 문자열이기 때문에 초기값 null

	Exam07() {} // 디폴트 생성자

	Exam07(int number) { // int 1개 매개변수 생성자
		this.number = number;
	}

	Exam07(String name) { // String 1개 매개변수 생성자
		this.name = name;
	}

	void prints() {
		
		if(name == null) { // 필드 name 변수 초기값이 null이면 true
			System.out.println(number + "번 아이언입니다.");
		}else { // 문자열에 값이 있다면 출력
			System.out.println(name+"입니다.");
		}

	}
}
