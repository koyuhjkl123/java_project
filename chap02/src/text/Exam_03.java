package text;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//	초(second)를 입력하면 시간, 분, 초로 환산해 출력하는 프로그램을 작성하라.

		System.out.println("초 단위를 입력하세요");
		int second = sc.nextInt();
		int hors, minute;

		minute = second / 60;
		hors = minute / 60;
		minute %= 60;
		second %= 60;
		System.out.printf("%d시간 %d분 %d초", hors, minute, second);

	}

}
