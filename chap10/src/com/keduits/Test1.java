package com.keduits;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		int sum1 = 0;
		int sum2 = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("자연수2 : ");
		int num2 = sc.nextInt();
		
		
		for(int i=num1; i < num2; i++) {
			sum1 += i;
			
			if(i % 3 == 0) {
				sum2 += (i*i);
			}
		}
		
		System.out.println("자연수의 합1 : " + sum1);
		System.out.println("자연수의 합2 : " + sum2);
		
		
	}

}
