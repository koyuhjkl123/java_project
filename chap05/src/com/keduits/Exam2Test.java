package com.keduits;

public class Exam2Test {

	public static void main(String[] args) {

		System.out.println(sumExceptFirst(1, 2, 3, 4));
		int arr[] = { 2, 3 };

		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));

	}

	public static int sumExceptFirst(int c, int... s) {
		// 가변 매개변수는 추가적인 매개변수가 있을 시 '반드시' 뒤에 넣어야 한다.
		// int... 매개변수 : 가변 매개변수는 모든 int값을 인정함
		// 매개변수 1개 가변매개변수을 이용한 합계 static 메서드
		
		// 향상된 for문 가변 매개변수를 이용하여 i의 변수를 대입
		int sum = 0; // 지역변수 sum 초기화
		for (int i : s) {
			sum += i; // sum = sum + i
		}
		return sum; // for문을 이용하여 합한 총 합계를 리턴

		
	}

}
