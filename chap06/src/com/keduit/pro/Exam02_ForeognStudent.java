package com.keduit.pro;

public class Exam02_ForeognStudent extends Exam02_Student {

	protected String foreogn;

	protected Exam02_ForeognStudent(String name, int age, int number, String foreogn) {

		super(name, age, number);
		this.foreogn = foreogn;
	}
	
	
	public String getforeogn() {
		return foreogn;
	}

	@Override
	protected void show() {
		System.out.printf("[이름 : %s,  나이 : %d, 학번 : %d, 국적 %s]\n", name, age, number, foreogn);
	}
}
