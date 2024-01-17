package text;

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("char의 형식의 문자형 아무것나 입력하세요");
		char c = sc.next().charAt(0);
		int a = (int)'A'-(int)'a';
        char ac = (char) ((int) c + a);

        System.out.println(ac);
        
	}

}
