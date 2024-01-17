package com.keduits;

import java.util.Scanner;

public class _Template06Test {

	String s;

	static void next() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("vmd");
		System.out.println("철수 : ");
		String num1 = scanner.nextLine(); // s 가위 r 바위 p 보

		System.out.println("영희 : ");
		String num2 = scanner.nextLine();

		if (num1.equals("r") == num2.equals("s") && num1.equals("s") == num2.equals("p")
				&& num1.equals("p") == num2.equals("r")) {
			System.out.println("철수, 승!");
		} else if (num1.equals(num2)) {
			System.out.println("무승부!");
		} else {
			System.out.println("영희, 승!");
		}
	}

	public static void main(String[] args) {
		next();
	}

}
