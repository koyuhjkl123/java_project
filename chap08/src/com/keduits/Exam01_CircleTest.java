package com.keduits;

public class Exam01_CircleTest {

	public static void main(String[] args) {
		
		// 반지름이 같은 Circle 객체를 모두 동일한 종류로 취급
		Exam01_Circle c1 = new Exam01_Circle(3);
		Exam01_Circle c2 = new Exam01_Circle(3);
		
		
		if(c1.equals(c2)) {
			System.out.println("c1과 c2는 같다");
		}else {
			System.out.println("c1과 c2는 다르다");
		}

	}

}
