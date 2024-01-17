package com.keduits;

import java.util.Scanner;

public class Exam4Test {

	public static void main(String[] args) {

		iscontains();

	}

	static void iscontains() {

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("URL을 입력하세요");
			String url = sc.nextLine();

			if (url.endsWith("com")) { // 주어진 문자열이 "com" 끝나는지 확인
				System.out.printf("%s은 'com'으로 끝납니다.\n", url);
			} else if (url.equals("bye")) {
				break;
			} // contains : url  문자열 내에 특정 java 포함되어 있는지 여부를 확인
			if (url.contains("java")) {
				System.out.printf("%s은 'java'를 포함합니다.\n", url);
			}
		}

	}

}
