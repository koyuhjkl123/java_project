package com.keduits;

public class _Template09 {

	static void foo(String x) {

		System.out.printf("%s\n", x);
	}

	static void foo(String x, int y) {
		System.out.printf("%s  %d\n", x, y);
	}

	static void foo(String x, int y, int c) {
		System.out.printf("%s  %d  %d\n", x, y, c);
	}

	public static void main(String[] args) {

		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}

}
