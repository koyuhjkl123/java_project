package com.keduit;

public class _04_Trycatch1Test {

	public static void main(String[] args) {
		
		int[] arr = {100, 200, 300};
		
		try {
			System.out.println("마지막 원소 => " + arr[3]);
			System.out.println("첫번째 원소 => " + arr[0]);
			
//			Exception 발생되는 순간 catch로 제어권이 넘어간다.
//			그러므로 두번째 println 가 무시된다.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않아요");
		}
		System.out.println("어이쿠!!");

	}

}
