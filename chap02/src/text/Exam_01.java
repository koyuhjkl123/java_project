package text;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		
		System.out.printf("%d의 제곱은 %d", num, num*num);
	}

}
