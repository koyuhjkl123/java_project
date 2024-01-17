package com.keduit;

public class ScannerString {

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.print("문자열 입력 : ");
//		String str1 = in.nextLine();
//		
//		System.out.print("문자열 입력 : ");
//		String str2 = in.nextLine();
//		
//		System.out.printf("입력된 문자열 1 : %s\n", str1);
//		System.out.printf("입력된 문자열 2 : %s\n", str2);
		
		int num1 = 1;
		int num2 = 2;
		int num3;
		
		char ii = '\u0000';
		
		num3 = num1++;
		System.out.println(num3);
		
		num3 = ++num1;
		System.out.println(num3);
		
		System.out.printf("%x\n", 0b0110 << 2); // ob1100 > 16진수 변환 > 18
		System.out.printf("%x\n", 0b0110 >> 2); // ob0001 > 16진수 변환 > 1
		System.out.println(0b1010 << 2); // 24

	}

}
