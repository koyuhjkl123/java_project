package com.keduit;

public class Hello {
	
	/**
	 * 콘솔에 "Hello world!"를 출력하는 자바 프로그램
	 */

	public static void main(String[] args) {
		/*
		 * 메인 메소드 내부
		 * 여러줄 주석 ctrl + shift + 슬레쉬
		 */
		System.out.println("Hello world");

		String hello = "안녕!";

		System.out.println();
		System.out.println(hello);
		
		
		byte i = 100;
		byte s = 20;
		byte sum = 100 + 20;
//		byte num = i + s; error > 데이터 타입을 int로 변경을 해야 된다. 변수로 더했을 땐 int인 정수값
//		byte kor2 = 300; byte란 타입의 크기가 값을 준 크기 보다 커서 오류 발생
	}

}
