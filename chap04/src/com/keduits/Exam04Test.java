package com.keduits;

public class Exam04Test {

	public static void main(String[] args) {
		
		Exam04 c1 = new Exam04("red");
		Exam04 c2 = new Exam04("blue");
		Exam04 c3 = new Exam04("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", 
				Exam04.getNumOfCar(),Exam04.getNumOfRedCar() );
	}

}
