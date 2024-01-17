package com.keduits;

import java.util.Scanner;

public class Student {
	
	enum STUDENTS{
		A("최우수"), B("우수"), C("보통"), D("미흡"), E("탈락");
		
		private String s; // 상수 문자열 s

		STUDENTS(String s) { // 열거형 타입으로 한 STUDENTS 생성자
			this.s = s;
		}
	}

	public static void main(String[] args) {

		int numOfStudents = 0;
		int[] scores;
		int numbers = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수 : ");
		numOfStudents = sc.nextInt(); // 입력값 3
		scores = new int[numOfStudents]; // 3개의 객체를 생성하여 scores변수에 대입
//		scores 배열에 numOfStudents 대입할려면 새로운 배열의 크기를 생성해야한다.
//		new int[numOfStudents]

		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요"); // 3명

		for (int i = 0; i < scores.length; i++) {// i가 scores크기보다 작을때 꺼지 반복
			scores[i] = sc.nextInt(); // scores의 인덱스번호[0], 1, 2 각 점수를 입력
		}

		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");

		for(int i: scores) { // scores의 입력된 배열 정보를 i변수에 한개씩 대입
			System.out.print(i + " "); // 출력
			
			if(i >= 90) {
				System.out.printf("%d번 학생의 등급은 %s입니다.\n", (++numbers), STUDENTS.A);
			}else if(i >= 80) {
				System.out.printf("%d번 학생의 등급은 %s입니다.\n", (++numbers), STUDENTS.B);
			}else if(i >= 70) {
				System.out.printf("%d번 학생의 등급은 %s입니다.\n", (++numbers), STUDENTS.C);
			}else if(i >= 60) {
				System.out.printf("%d번 학생의 등급은 %s입니다.\n", (++numbers), STUDENTS.D);
			}else {
				System.out.printf("%d번 학생의 등급은 %s입니다.\n", (++numbers), STUDENTS.E);
			}
		}
		
//		for (int i = 0; i < scores.length; i++) { for ~each 변경 전
//			System.out.print(scores[i] + " "); // 키보드로 입력된 각 점수를 출력
//		}
		
		
	}

}
