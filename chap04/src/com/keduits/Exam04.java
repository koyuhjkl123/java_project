package com.keduits;

public class Exam04 {

	private static int NumOfCar; // 총 자동차 수
	private static int NumOfRedCar; // 총 빨간색 자동차 수
	String color; // 자동차
	
	
	Exam04(String color){ // Exam04 생성자(생산된 자동차)
		this.color = color; // 인자값을 통해 받은 자동차 색상 
		NumOfCar++; // 자동차 생산될 때 마다 NumOfCar이 1씩 증가
		
		if(color.equals("레드") || color.equals("red") || color.equals("RED")) {
			NumOfRedCar++; // 레드, red, RED 라는 문자열과 동일하다면 NumOfRedCar 1씩 증가
		}
	}

	public static int getNumOfCar() { // 값 반환
		return NumOfCar;
	}

	public static int getNumOfRedCar() {// 값 반환
		return NumOfRedCar;
	}

	
}
