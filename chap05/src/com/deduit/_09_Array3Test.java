package com.deduit;

public class _09_Array3Test {

	public static void main(String[] args) {

		int[] one2five = { 1, 2, 3, 4, 5};

		int sum = 0;

		for (int i = 0; i < one2five.length; i++) {
			one2five[i]++;
		}

		for (int i : one2five) {
			sum += i;
		}

		System.out.println("평균: " + sum / (double) one2five.length);
	}

}






