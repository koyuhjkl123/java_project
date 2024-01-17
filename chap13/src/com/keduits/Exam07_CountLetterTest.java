package com.keduits;

import java.io.IOException;
import java.util.Scanner;

public class Exam07_CountLetterTest {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("파일 이름을 입력하세요 : ");
		
		String fileName = in.nextLine();
		System.out.print("세고자 하는 문자를 입력하세요 : ");
		char lookFor = in.nextLine().charAt(0);
		
		int count = new CountLetter(lookFor, fileName).count();
		
		System.out.format("%s 파일에 %c 문자가 %d개 \n", fileName, lookFor, count);
		
//		C:\\Temp\\words.txt
	}

}
