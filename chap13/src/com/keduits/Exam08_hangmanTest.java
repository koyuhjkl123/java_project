package com.keduits;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam08_hangmanTest {


	public static void main(String[] args) throws IOException {

		String fileName = "C:\\Temp\\words.txt"; // 파일 위치
		Scanner in = new Scanner(System.in);

		String[] String_names = { "apple", "kiwi", "melon", "grape", "cherry", "tomato", "banana", "Lemon", "Orange",
				"Peach" };

		try {
			DataOutputStream dd = new DataOutputStream(new FileOutputStream(fileName));
			DataInputStream dt = new DataInputStream(new FileInputStream(fileName));

			dd.writeUTF(String_names[(int) (Math.random() * String_names.length)]);

			String ss = dt.readUTF();
			
			int count_end = 6; // 끝
			int count_start = 0; // 시작
			StringBuilder scv = new StringBuilder("-".repeat(ss.length()));
			
			while(true) {
				System.out.println("추측할 단어입니다 : " + scv);
				System.out.println("지금까지 추측한 내용입니다.");
				System.out.println("추측한 문자를 입력하세요 : ");
				char ch = in.next().charAt(0);
				if (count_start < count_end) {
//					내가 입력한 단어가 10가지 중 나온 문자열에 값과 포함되어 있는지
					if (ss.contains(String.valueOf(ch))) {
						for (int i = 0; i < ss.length(); i++) {
//						포함되어 있다면 길이만큼 반복하고 내가 입력한 단어와 위치가 같다면
//						그 위치에 내가 입력한 값을 넣는다.
							if (ss.charAt(i) == ch) {
								scv.setCharAt(i, ch);
							}else if(ss == scv.toString()){
								System.out.println("축하해요! 추측하신 모두 단어를 맞추셨습니다.");
							}
						}
						System.out.printf("정확한 추측입니다 - %d번 더 추측할 수 있습니다.\n", count_end - count_start);
						count_start++;
						
					}else {
						System.out.printf("잘못된 추측입니다 남은 회수 : %d\n", count_end - count_start);
						count_start++;
					}
				}else{
					System.out.printf("사용 횟수 %d번을 모두 사용하셧습니다.\n",count_start);
					break;
				}
			}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}

}
