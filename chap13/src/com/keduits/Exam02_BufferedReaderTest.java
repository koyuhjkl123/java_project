package com.keduits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02_BufferedReaderTest {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("입력하세요");
		String resultString = reader.readLine();
		System.out.println("입력된 값 : "+resultString);

	}

}
