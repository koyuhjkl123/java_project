package com.keduit.pro;

public class Exam04_OvershadowTest {

	public static void main(String[] args) {
		
		Exam04_Parent parent1 = new Exam04_Child();
		
		System.out.println(parent1.name);
		parent1.print();

	}

}
