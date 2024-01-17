package com.keduits;

public class Exam02Test {

	public static void main(String[] args) {
		
		Exam02 t1 = new Exam02(10.0,5.0);
		Exam02 t2 = new Exam02(5.0,10.0);
		Exam02 t3 = new Exam02(8.0,8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));

	}

}
