package com.keduit;

import java.util.Scanner;

public class _18Methold_2 {
	
	static int add(int x, int y) {
		int sum = 0;
		for(int i=x; i <= y; i++) {
			sum += i;
			
		}
		return sum;
	}
	
	public int sum(int x, int y) {
		int sum = 0;
		for(int i=x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		
		System.out.println("합(10~100) " + add(1, 10));
		System.out.println("합(100~1000) " + add(10, 100));
		System.out.println("합(100~1000) " + add(100, 1000));
		System.out.println("-----");
		
		_18Methold_2 s = new _18Methold_2();
		Scanner scanner = new Scanner(System.in);

		System.out.println("합(10~100) " + s.sum(1, 10));
		System.out.println("합(100~1000) " + s.sum(10, 100));
		System.out.println("합(100~1000) " + s.sum(100, 1000));
		System.out.println("-----");


	}
	
}
