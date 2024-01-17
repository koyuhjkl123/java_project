package com.keduits;

import java.io.File;

public class Exam01_fileTest {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\Temp\\file.txt");
		
		System.out.println("파일의 존재 유무 : "+file.exists());
		
	}

}
