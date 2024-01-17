package com.keduits;

public interface Exam02_Delicious extends Exam02_Edible, Exam02_Sweetable{
// 인터페이스 다중 상속
	@Override
	default void eat() { // Exam02_Edible 메소드
		System.out.println("eat의 메소드입니다.");
	}
	
	@Override
	default void sweet() { // Exam02_Sweetable 메소드
		System.out.println("sweet의 메소드입니다.");
	}
}

