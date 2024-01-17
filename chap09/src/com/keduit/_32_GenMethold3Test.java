package com.keduit;

public class _32_GenMethold3Test {

	public static void main(String[] args) {

		_31_Ticket[] a = { new _31_Ticket(5), new _31_Ticket(15), new _31_Ticket(100), new _31_Ticket(40),
				new _31_Ticket(15) };

		System.out.println(ciunTest(a, a[4]));

	}

	private static <T extends Comparable> int ciunTest(T[] a, T elemet) {
		int count = 0;
		for (T e : a) {
			if (e.compareTo(elemet) > 0) {
				++count;
			}
		}
		return count;
	}

}
