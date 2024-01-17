package com.keduit;

public class OperatorPrecedence {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		int z = ++x * y--;
		System.out.println(x + "\t" + y + "\t\n" + z);

		int year = 2020;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}

}
