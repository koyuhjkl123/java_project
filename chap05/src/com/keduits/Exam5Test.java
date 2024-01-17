package com.keduits;

import java.util.Scanner;

public class Exam5Test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] count = new int[10]; // 10단위로 각 구간의 개수를 저장할 배열

		System.out.print("숫자를 10개 입력하세요");

		for (int i = 0; i < count.length; i++) {

//			10번의 값 입력
			int num = scanner.nextInt();
			
			
			System.out.printf("숫자 %d번 입력하셨습니다.\n", i+1);
			if (num < 0 || num > 99) { // 입력한 값이 음수이거나 99이상이라면 무시
				continue;
			}

			// 히스토리 구간별 count 배열에 1씩 증감
			// 10단위로 간격을 두고 해당 count 값을 1씩 증가
			// 예 : num 25라면 25 / 10 = count[2] : 20 ~ 29 구간에 1증가
			count[num / 10]++;
		}
//           // 히스토리 구간 출력
		for (int i = 0; i < count.length; i++) { // 0 ~ 9 : 90 ~ 99
			System.out.printf("%d ~ %d  ", (i * 10), (i * 10 + 9));

			// 히스토리 구간별 별찍기
			for (int j = 0; j < count[i]; j++) {
				System.out.print("*"); // count[i]번째에 값 만큼 *출력
			}
			System.out.println(""); // Enter키
		}

	}
}
