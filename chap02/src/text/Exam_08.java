package text;

import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		전공 이수 학점 : 75
//		- 교양 이수 학점 : 70
//		- 일반 이수 학점 : 10

		System.out.println("전공 이수 학점 : ");
		int a = sc.nextInt();
		System.out.println("교양 이수 학점 : ");
		int b = sc.nextInt();
		System.out.println("일반 이수 학점 : ");
		int c = sc.nextInt();

		int bc = b + c; // 교양, 일반 점수
		int abc = a + b + c; // 총 학점 점수
		boolean bns = (b >= 30) && (c >= 30) || (bc >= 80); // 각 교양, 일반이 30점 이상 이거나 80점이상
		boolean tr = (abc >= 140); // 총 학점이 140보다 큰가? > true or false

		if (tr && (a >= 70) && bns) {
			System.out.println("전공 이수 학점 : " + a);
			System.out.println("교양 이수 학점 : " + b);
			System.out.println("일반 이수 학점 : " + c);
			System.out.println("졸업 가능");
		} else if (a <=70) {
			System.out.printf("전공 점수 : %d점이 부족합니다.", (70 - a));
		} else if (!tr) {
			System.out.printf("%d점의 총 학점이 부족합니다.", (140 - abc));
		} else {
			System.out.println("교양과 일반 점수가 부족합니다.");
		}

	}

}
