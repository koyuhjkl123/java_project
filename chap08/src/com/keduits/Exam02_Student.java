package com.keduits;

public class Exam02_Student {
	
	String name; // 이름
	
	
	public Exam02_Student(String name) {
//	생성자 매개변수넣고 만든 이유 : 테스트프로그램에서 인자값을 받기 때문
		this.name = name;
	}
	
	@Override
	public String toString() { // Object 클래스에 있는 메소드
//	테스트 프로그램에서 출력문안에 new 객체 생성을 했기 때문에
//	toString() 메소드를 오버라이드를 하여 값을 반환하면 된다.
//	다형성을 이용
		return "학생[" + this.name + "]";
	}

}
