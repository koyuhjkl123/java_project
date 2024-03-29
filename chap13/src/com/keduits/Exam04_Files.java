package com.keduits;

import java.io.File;
import java.util.Scanner;

public class Exam04_Files {

//	내가 찾고자 하는 파일이 폴더 위치를 모를 경우 찾기
	public static void sershFiles(File fils, String name) {

		int number = 1; // 행 번호

//		찾은 파일의 목록을 배열로 만든 이유는 향상된 for문을 사용하기 위함
		File[] file = fils.listFiles();

//		null 이라고 조건을 건 이유는 listFiles() 값을 반환은 하지만
//		내가 찾고자 하는 하위폴더에 폴더 자체가 없거나, 읽기 권한이 없을 경우 null를 반환
//		그렇기에 그걸 방지 하고자 =! null를 한것.. 굳이 안해도 됨
//		if (file != null) {
			for (File f : file) {
//				목록에 있는 값이 폴더인지 확인
//				폴더가 아니라면 else if로 넘어가고
//				폴더라면 sershFiles(f, name); 다시 호출하여 내가 찾고자 하는 파일을 찾는다.
				if (f.isDirectory()) {
					sershFiles(f, name); // 재귀 호출
//					스택영역에 차지하며, 메서드 호출 시 스택프레임생성 스택프레임 : 메서드 호출 시 생성됨 후입선출(LIFO, Last-In-First-Out)의 구조
				} else if (f.isFile() && f.getName().endsWith(name)) {
//						향상된 for문으로 이용하여 목록에 있는 각 (파일)을 하나씩 비교
//						파일 목록에 있는 값이 파일이고, 해당 파일이 내가 찾고자 하는 파일과 동일한다면 갖을 갖고온다.
					System.out.println(number + " : " + f.getName());
					number++;
				}

			}
//		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String filename = sc.nextLine();
		File fc = new File("D:\\myjava\\");

		sershFiles(fc, filename);

	}

}
