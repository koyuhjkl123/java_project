package com.keduits;

public class Exam03Test {

	public static void main(String[] args) {
		
		Exam03 c = new Exam03("홍길동", "keduit", "123$", 2126);
		
		System.out.println("이름 = : " + c.getName()+" id = : " + c.getId() + 
				" password = : " + c.getPass() + " 나이 : " + c.getAge());

	}

}
