package com.keduits;

import java.io.IOException;
import java.io.OutputStream;

public class Exam05_OutputStreamTest {

	public static void main(String[] args) throws IOException {
		
		OutputStream ops = System.out;
		
//		0부터 9까지 
		for(int i=0; i < 10; i++) {
			ops.write(String.valueOf(i).getBytes());
			ops.write(' ');
		}
		System.out.println();
//		A~Z까지
			for(char y='A'; y <= 'Z'; y++ ) {
			ops.write(y);
			ops.write(' ');
		}
		
		
		ops.flush();
	}

}
