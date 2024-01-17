package text;

import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		
//		키보드로 0부터 999사이의 정수를 입력받아 각 자릿수를 더한 결과를 출력하는 프로그램을 작성하라.

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~999사이의 숫자를 입력하세요");
		int num = sc.nextInt();
		
		boolean ts = (num < 999);
		
		if(ts) {
			int a = num / 100;
			int b = (num % 100) / 10;
			int c = ((num % 100) % 10 / 1);
			
			System.out.printf("각 자릿수의 합 = %d", a+b+c);
		}else {
			System.out.println("999이상의 값을 넣으셨습니다.");
		}
		
		
		
	}

}
