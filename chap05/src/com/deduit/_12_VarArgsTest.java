package com.deduit;

public class _12_VarArgsTest {

	public static void main(String[] args) {

		printSum("홍길동", 1, 2, 3, 4, 5);
		printSum("한정교", 10, 20, 30);

		System.out.println(String.format("My score is %.1f", 99.8));
		System.out.println(String.join(",", "one", "two", "three"));
	}

	public static void printSum(String name, int x, int... v) {
		int sum = 0;
		for (int i : v) {
			sum += i;
		}

		System.out.println(x + name + ":" + sum);
	}

}
