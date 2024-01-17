package com.keduit;

public class charTypeunicode {

	public static void main(String[] args) {

		char ch1 = 'A'; // 65
		char ch2 = 65;
		char ch3 = '\u0041';

		char ch4 = '헐';
		char ch5 = '확';
		char ch6 = 0xD5D0;
		char ch7 = 0xD655;
		char ch8 = 54736;
		char ch9 = 54869;
		int ch10 = 'A';

		System.out.println(ch1 + " " + ch2 + " " + ch3);
		System.out.println(ch4 + " " + ch6 + " " + ch8);
		System.out.println(ch5 + " " + ch7 + " " + ch9);

		ch1++;
		System.out.println(ch1 + 3);
		System.out.println((char) (ch1 + 3));

		ch1 = (char) (ch1 + 3);
		System.out.println(ch10);

	}

}
