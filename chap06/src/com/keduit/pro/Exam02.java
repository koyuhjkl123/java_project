package com.keduit.pro;

public class Exam02 {

	protected String name; // 이름
	protected int age; // 나이

	protected void show() {
		System.out.printf("[이름 : %s,  나이 : %d]\n", name, age);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	protected Exam02(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
