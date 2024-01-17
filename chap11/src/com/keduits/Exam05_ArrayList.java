package com.keduits;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam05_ArrayList {

//	최대값을 구하는 메서드
	public static int max(List<Integer> list) {
//		매개변수를 List<Integer> 타입으로 값을 받는다.
		int max = 0;// 최대값 지정하고자하는 변수 초기값

		for (int i = 0; i < list.size(); i++) { // list 크기만큼 반복
//			list에 있는 참조변수 i번째가 max보다 크면 해당 값을 max에 대입
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}

		return max;
	}

//  A, B, C 등급을 구하는 메서드
	public static void Chars(List<Integer> student) {

//		전달 받은 매개 변수로 입력받은 값의 크기 만큼 반복
		for (int i = 0; i < student.size(); i++) {
//			max 메서드에 해당 리스트의 값들을 전달하고 전달받은 값을 통해 학생 점수를 출력
//			최대 점수 : (90-10) 이상이 A
			if ((max(student.subList(0, student.size())) - 10) <= student.get(i)) {
				System.out.printf("%d번 학생의 성적은 %d점이며, 등급은 %s이다.\n", i, student.get(i), 'A');
//			최대 점수 : (90-10) 미만 (90-20) 이상은 'B'이며, 그외 C등급
			} else if ((max(student.subList(0, student.size())) - 10) > student.get(i)
					&& (max(student.subList(0, student.size())) - 20) <= student.get(i)) {
				System.out.printf("%d번 학생의 성적은 %d점이며, 등급은 %s이다.\n", i, student.get(i), 'B');
			} else {
				System.out.printf("%d번 학생의 성적은 %d점이며, 등급은 %s이다.\n", i, student.get(i), 'C');
			}
		}
	}

	public static void main(String[] args) {

//		성적을 입력
		Scanner sc = new Scanner(System.in);

//		입력받은 정수값을 저장할 ArrayList
		ArrayList<Integer> student = new ArrayList<>();

//		무한 반복
		while (true) {
			System.out.println("점수를 입력하세요 : ");
			int s = sc.nextInt(); // 입력한 정수값을 s라는 변수에 대입

			if (s < 0) { // 입력받은 값이 음수일 경우
				break; // 입력답은 값이 음수 라면 반복문 정지
			} else if (s > 0) { // 입력받은 값이 정수일 경우
				student.add(s); // 정수값만 ArrayList에 저장
			}
		}

		System.out.printf("전체 학생은 %d명입니다.\n", student.size());
//		ArrayList의 forEach 메서드는 Consumer 함수형 인터페이스를 사용
//		한개의 매겨변수를 받아 들이고 반환값이 없는 accept 메서드를 가짐
		student.forEach(k -> System.out.print(k.intValue() + " "));
		System.out.println(); // 줄바꿈

//		Chars 정적메서드에 subList student의 0부터 입력받은 크기만큼까지 주소에 있는 값을 가져온다.
		Chars(student.subList(0, student.size()));
	}

}
