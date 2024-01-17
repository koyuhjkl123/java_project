package com.keduits;

import java.util.Scanner;

public class _Template01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		if(a >= 19) {
			System.out.println("성년입니다.");
		}else {
			System.out.println("미성년입니다.");
		}
	}

}
