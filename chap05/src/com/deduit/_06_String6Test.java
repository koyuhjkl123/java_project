package com.deduit;

import java.util.Scanner;

public class _06_String6Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] scores = new int[5];

		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수를 입력하세요:");
			scores[i] = sc.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			
			sum += scores[i];
		}

		System.out.println("총 합계 : " + sum / 5.0);

	}

}
