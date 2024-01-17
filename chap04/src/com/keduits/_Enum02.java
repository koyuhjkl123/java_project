package com.keduits;

public class _Enum02 {
	
	enum Gender{MALE, FEMALE}// 각 상수의 유일한 인스턴스이다.
	enum Direction{EAST, WEST, SOUTH, NORTH}

	public static void main(String[] args) {
		
		Gender gender = Gender.FEMALE; //열거형 타입 상수 생성 방법
		
		if(gender == Gender.MALE) { // 출력 시 열거 타입 상수 이름이 출력된다.
			System.out.println(Gender.MALE + "는 병역 의무가 있다.");
		}else {
			System.out.println(Gender.FEMALE + "는 병역 의무가 없다.");
		}
		
//		if(gender == Direction.SOUTH) { // 서로 다른 열겨형 타입은 비교 및 연산을 허용하지 않는다.
//			System.out.println(Direction.SOUTH+"는 누구?");
//		}
//		

	}

}
