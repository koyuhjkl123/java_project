package com.keduits;

public class Exam05Test {

	public static void main(String[] args) {

		Exam05 a = new Exam05(1);
		Exam05 b = new Exam05(1);
		
		System.out.println(a.isSamLine(b));
		System.out.println(a == b);
	}

}
