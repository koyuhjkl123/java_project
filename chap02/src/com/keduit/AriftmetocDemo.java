package com.keduit;

import java.util.Scanner;

public class AriftmetocDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 입력 값 : ");
		int num1 = sc.nextInt(); // 25

		System.out.println("두번째 입력 값 : ");
		int num2 = sc.nextInt(); // 3

		if (num1 % num2 == 0) {
			System.out.printf("%d는 %d의 배수입니다", num1, num2);
		} else {
			System.out.printf("%d는 %d의 배수아닙니다.", num1, num2);
		}
		sc.close();
		
		String sum1 = ("%d는 %d의 배수입니다.");
		String sum2 = ("%d는 %d의 배수아닙니다.");
		
		
		
	}

}
