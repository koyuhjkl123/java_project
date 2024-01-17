package com.keduit;

import java.util.Scanner;

public class _02MutiIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int a = sc.nextInt();
		
		String result;
		
//		if(a >= 90) {
//			System.out.println("축하드립니다. A학점입니다.");
//		}else if(a >=80) {
//			System.out.println("축하드립니다. B학점입니다.");
//		}else if(a >= 70) {
//			System.out.println("안타깝습니다. C입니다.");
//		}else if(a >= 60) {
//			System.out.println("안타깝습니다. D입니다.");
//		}else {
//			System.out.println("불합격되셨습니다^^ F입니다.");
//		}
//		System.out.println("당신의 점수는 : " + a+"점 입니다.");

		if(a >= 90) {
			if(a >= 96) {
				result = "A+";
			}else {
				result = "A-";
			}
		}else if(a >=80) {
			if(a >= 86) {
				result = "B+";
			}else {
				result = "B-";
			}
		}else if(a >= 70) {
			if(a >= 76) {
				result = "C+";
			}else {
				result = "C-";
			}
			
		}else if(a >= 60) {
			if(a >= 66) {
				result = "D+";
			}else {
				result = "D-";
			}
		}else {
			result = "F";
		}
		System.out.println(" 당신의 등급 : "+result);
		
		
		
	}

}
