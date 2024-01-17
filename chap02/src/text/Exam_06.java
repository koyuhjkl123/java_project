package text;

import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세여");
		int num = sc.nextInt();

		boolean a = (num % 4 == 0);
		boolean b = (num % 5 == 0);

		boolean ab = a && b;
		System.out.println("4와5로 나누어지는가 : " + ab);

		boolean ac = a || b;
		System.out.println("4또는 5로 나누어지는가 : " + ac);

		boolean ad = (a || b) && !(a && b);
		System.out.println("4나 5는 나누어지지만 둘다 나누어 지지 않는다 " + ad);

	}

}
