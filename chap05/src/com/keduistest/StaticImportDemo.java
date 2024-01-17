package com.keduistest;

import static java.util.Arrays.sort; // 정적 import

import java.util.Calendar; // import문

public class StaticImportDemo {

	public static void main(String[] args) {

		int[] data = {3, 5, 1, 7};
		sort(data); // 정적import문이 있다면 클래스 없이 사용 가능
		System.out.println(Calendar.JANUARY); // import문일 경우 클래스명.필드 함께사용
		Calendar.getInstance(); // import문일 때 클래스명.메서드()
		System.out.println(Calendar.getInstance());
	}

}
