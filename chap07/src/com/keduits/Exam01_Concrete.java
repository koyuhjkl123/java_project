package com.keduits;

public class Exam01_Concrete extends Exam01_Abstract{

	int j;
	public Exam01_Concrete(int i, int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	void show() { // 부모클래스인 추상 메소드를 구현
		System.out.printf("i = %d, j = %d", i, j);
	}

}
