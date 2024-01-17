package com.kediuts;

public class Exam04_PairTest {

	public static void main(String[] args) {

		Exam04_Pair<Integer> p1 = new Exam04_Pair<>(10, 20);
		Exam04_Pair<Double> p2 = new Exam04_Pair<>(10.0, 20.0);

		System.out.println(p1.first());
		System.out.println(p2.second());
	}

}
