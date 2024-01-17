package com.keduits;

public class Exam06_Student extends Exam06_worker{

	int number;

	Exam06_Student(int number) {
		this.number = number;
	}

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}

	@Override
	public void print() {
		System.out.printf("%d세의 학생입니다.\n", number);
	}
	
}
