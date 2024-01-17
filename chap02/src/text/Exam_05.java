package text;

import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("화씨온도를 입력하세요");
		int f = sc.nextInt();
		
		double c = (double)5 / 9 * (f-32);
		
		System.out.printf("화씨온도 : %.1f", c);
		

	}

}
