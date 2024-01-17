package com.keduits;

public interface Exam06_Human {
	
	void eat();
	
//	Exam06_worker은 수정 할 수 없다라는 조건이 있기 때문에 default를 넣는다.
	default void print() {
		System.out.println("인간입니다.");
	}
	static void echo() {
		System.out.println("야호!!!");
	}


}
