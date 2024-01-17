package com.keduit;

import java.util.Scanner;

public class _09_ThrowsTest {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			square(sc.nextLine());			
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아니군요");
		}
	}

	private static void square(String nextLine) throws NumberFormatException {
//		
//		try {
//			int n = Integer.parseInt(nextLine);
//			System.out.println(n*n);
//		} catch (NumberFormatException e) {
//			System.out.println("숫자가 아니군요");
//		}
		int n = Integer.parseInt(nextLine);
		System.out.println(n*n);
		
	}
}
