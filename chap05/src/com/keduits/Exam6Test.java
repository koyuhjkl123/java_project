package com.keduits;

public class Exam6Test {

	public static int[] reverse(int[] org) {

		int[] arr = org; // main메소드에 있는 arrays 배열 변수를 arr에 대입
		// j : 5, 4, 3, 2, 1
		for (int j = 5; j > 0; j--) {
			// org[i-1] : org[5-1] 4~0번째 index 값 차례대로 반환
			System.out.print(arr[j-1] + " ");
		}

		return arr;
	}

	public static void main(String[] args) {

		// 배열의 원소를 역순으로 나오게 하는 배열을 반환하라

		int[] arrays = {1,2,3,4,5};

		reverse(arrays); //정적(static) 메서드

	}

}
