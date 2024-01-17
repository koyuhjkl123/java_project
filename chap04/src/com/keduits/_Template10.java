package com.keduits;

import java.util.Scanner;

public class _Template10 {
	
	static boolean isPrime(int x) {
		
		if(x <=1) {
			return false;
		}
		
		for(int i=2; i*i <= x; i++) { // 제곱근
			if(x % i ==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		System.out.println("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		
		if(isPrime(num)) {
			System.out.println(num + "는 소수입니다.");
		}else {
			System.out.println(num+"는 소수가 아닙니다.");
		}
		

	}

}
