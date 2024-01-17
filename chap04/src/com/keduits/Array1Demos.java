package com.keduits;

import java.util.Scanner;

public class Array1Demos {

	public static void main(String[] args) {


		
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		System.out.println("실행");
		
		for(int i=0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("평균 = " + sum / 5.0);
	}

}
