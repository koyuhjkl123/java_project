package com.keduits;

import java.util.Scanner;

public class _Template03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int sum = 0;
		
		do {
			System.out.println("양의 정수를 입력하세요");
			a = sc.nextInt();
			if (a % 2==0) {
				sum += a;
			}
			if(a < 0) {
				break;
			}
		} while (a > 0);
		System.out.println(sum);
	}
	
}
