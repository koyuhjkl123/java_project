package com.keduit;

import java.util.Scanner;

public class _03IfIdPassword {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디를 입력하세요");
		String ids = sc.nextLine();

		System.out.println("비밀번호를 입력하세요");
		String pas = sc.nextLine();

		String a = "keduit";
		String b = "123$";
		if ((ids.equals(a)) && (pas.equals(b))) {
			System.out.println("성공적으로 로그인 하셨습니다.");
		} else if (ids.equals(a)) {
			System.out.println("비밀번호를 틀리셨습니다.");
		} else if (pas.equals(b)) {
			System.out.println("아이디를 잘못 입력하셨습니다.");
		} else {
			System.out.println("아이디 비밀번호 잘못입력하셧습니다."); 
		}
		sc.close();

	}

}
