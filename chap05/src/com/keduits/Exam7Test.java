package com.keduits;

import java.util.Arrays;

public class Exam7Test {
	
	
	public static boolean isSameArea(int[] a, int[] b) {
		// Object equals == 주소값을 비교하기 위해 정의된 메소드
		// 클래스 Object(부모) 자식 클래스인 String 클래스는  equals 라는 메소드는 값을 비교 하기위해 재정의된 메소드다
		if(Arrays.equals(a, b)) {
			// 인덱스 '위치', '값', '길이' 모두 동일해야 true가 반환, 아니면 false
			return true; 
		}else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		
		int[] a = {3, 2, 4, 1, 5};
		int[] b = {3, 2, 4, 1};
		int[] c = {3, 2, 4, 1, 5};
		int[] d = {2, 7, 1, 8, 2};

		System.out.println(isSameArea(a,b)); // false
		System.out.println(isSameArea(a,c)); // true
		System.out.println(isSameArea(a,d)); // false
		System.out.println(isSameArea(b,c)); // false
		System.out.println(isSameArea(c,a)); // true
		System.out.println(isSameArea(b,d)); // false
		System.out.println(isSameArea(c,d)); // false
	}

}
