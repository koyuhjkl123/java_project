package com.keduits;

public class Exam03 {

	private String name;
	private String id;
	private String pass;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	Exam03(String name, String id, String pass, int age){ // 객체 생성 후 초기화 당담
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.age = age;
	}
	void setExam03(String name, String id, String pass, int age) { // 객체 생성 이후 설정 하기 위해
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.age = age;
	}

}
