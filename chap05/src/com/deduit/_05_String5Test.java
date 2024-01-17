
package com.deduit;

public class _05_String5Test {

	public static void main(String[] args) {
		
		
		// 정적 String : String클래스를 활용, format, join, valueOf 사용가능
		String version = String.format("%s %d", "JDK", 14);
		System.out.println(version);
		
		
		String fruit = String.join(",","apple", "banana", "cherry");
		System.out.println(fruit); // 추가 
		
		
		String pi = String.valueOf(3); // valueOf : 기본 자료형을 String 문자열로 변경한다.
		System.out.println(pi);
	}
}
