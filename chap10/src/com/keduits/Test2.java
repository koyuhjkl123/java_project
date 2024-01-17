package com.keduits;

public class Test2 {

	public static void main(String[] args) {

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("눈1 : " + num1);
			System.out.println("눈2 : " + num2);
			if ((num1 + num2) == 6) {
				break;
			}
		}

	}

}
