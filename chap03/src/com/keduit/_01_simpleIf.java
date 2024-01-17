package com.keduit;

import java.util.Scanner;

public class _01_simpleIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("짝수!");
		}else {
			System.out.println("홀수!");
		}
		System.out.println("종료!");

	}

}
