package com.keduit;

import java.util.Arrays;

public class _11_ArraysTest {

	public static void main(String[] args) {

		char[] a1 = { 'J', 'a', 'v', 'a' };
		char[] a2 = Arrays.copyOf(a1, a1.length);
		System.out.println(a2);

		String[] sa = { "케이크", "애플", "도넛", "바나나" };
		System.out.println(sa);
		print(sa);

		Arrays.sort(sa);

		System.out.println(Arrays.binarySearch(sa, "도넛"));

		Arrays.fill(sa, 2, 4, "포도");
		print(sa);
	}

	public static void print(Object[] sa) {
		for (Object o : sa) {
			System.out.print(o + " ");
		}

	}
}
