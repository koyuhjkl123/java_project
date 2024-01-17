package com.keduits;

import java.util.Scanner;

public class _Template07 {

	static void whosWin(String c, String y) {

		if (c.equals("r") == y.equals("s") && c.equals("s") == y.equals("p") && 
				c.equals("p") == y.equals("r")) {
			System.out.println("철수, 승!");
		} else if (c.equals(y)) {
			System.out.println("무승부!");
		} else {
			System.out.println("영희, 승!");
		}
	}

	public static String input(String name) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(name + "님, s(가위) r(바위) p(보) 중 입력하세요:");
		return scanner.nextLine();
	}

	public static void main(String[] args) {

		_Template07 plat = new _Template07();

		String c = input("철수");
		String y = input("영희");

		whosWin(c, y);

	}

}
