package com.keduit;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자값을 입력하세요");
		int x = sc.nextInt();
		int y= sc.nextInt();
		
		System.out.printf("%d x %d = %d", x, y, x*y);
		sc.close();
		

	}

}
