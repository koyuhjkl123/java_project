package com.test;

import java.util.Scanner;

public class Test01 {
	
	double rds = 2.0; // 인스턴스 변수 or 멤버변수
	
	
	public double getvolume() { // 메서드 (static으로 할경우 클래스 변수)
		return 4/ 3 * 3.14 * rds * rds *rds; 
	}
	
	public static void increment(int n) {
		System.out.println("increment()의 메서드가 시작 "+n);
		System.out.println("increment()의 메서드가 끝날때 "+n);
	}
	
	public void InCrement(int n) {
		System.out.println("increment()2의 메서드가 시작 "+n);
		n++;
		System.out.println("increment()2의 메서드가 끝날때 "+n);
	}

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		
		for(int i=0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("평균 = " + sum / 5.0);
	}


	

}
