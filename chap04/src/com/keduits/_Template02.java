package com.keduits;

import java.util.Scanner;

public class _Template02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("등수를 입력하세요");
		String scv = sc.nextLine();
		switch (scv) {
		case "1등":
			System.out.println("아주 잘했습니다.");
			break;
		case "2등":
		case "3등":
			System.out.println("잘했습니다.");
			break;
		case "4등":
		case "5등":
		case "6등":
			System.out.println("보통입니다.");
			break;
		default:
			System.out.println("노력하겠습니다.");
			break;
		}
	}

}
