package com.keduit;

public class _10_For1 {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			System.out.println(i);
		}

		int sum = 0;
		for (int i = 2; i <= 9; i++) {
			for (int y = 1; y <= 9; y++) {
				sum = i * y;
				System.out.printf("%4d ", sum);

			}
			System.out.println("");
		}

	}

}
