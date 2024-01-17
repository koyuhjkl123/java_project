package com.keduit;

public class _11_TestOr {

	public static void main(String[] args) {

//		for (int i = 1; i < 6; i++) {
//			// j: 열
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i < 6; i++) {
			// j: 열
			for (int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			  // j: 열
			  for (int j = 0; j < i; j++) {
				  System.out.print(" ");
			  }
			  for(int j=5; j > i; j--) {
				  System.out.print("*");
				  
			  }
			  System.out.println();
			}

	}

}
