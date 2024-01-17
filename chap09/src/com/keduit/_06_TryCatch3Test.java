package com.keduit;

public class _06_TryCatch3Test {

	public static void main(String[] args) {
		
		int[] array = {100, 200, 300};
		
		try {
			int x = array[3];
		} catch (Exception e) { // Exception 조상이다.
			System.out.println("여기에서 모두처리 됨.");
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
		}
		System.out.println("종료");

	}

}
