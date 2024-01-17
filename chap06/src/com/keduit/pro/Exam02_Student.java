package com.keduit.pro;

public class Exam02_Student extends Exam02 {

	protected int number; // 학번
	
	protected Exam02_Student(String name, int age, int number) {
		super(name, age);
		this.number = number; 
	}
	
	
	
	public int getNumber() {
		return number;
	}



	@Override
	protected void show() {
		System.out.printf("[이름 : %s,  나이 : %d, 학번 : %d]\n", name, age, number);
	}
}
