package com.keduitts;

public class StudentsTest {

	public static void main(String[] args) {
		
		Student stu = new Student();
		
		stu.name = "홍길동";
		stu.ban = 1;
		stu.no = 1;
		stu.kor = 100;
		stu.eng = 60;
		stu.math = 76;
		
		System.out.println("이름 : " + stu.name);
		System.out.println("총점 : " + stu.getTotal());
		System.out.println("평균 : " + stu.getAverage());
		System.out.println("총 : " + stu.info());

	}

}
