package com.keduits;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Exam06_PrintStreamTest {

	public static void main(String[] args) throws IOException {

		String[] animals = { "ant", "bat", "cat", "dog" };
		String data = "C:\\Temp\\String.txt";
		PrintStream ps;

		try {
			DataOutputStream dd = new DataOutputStream(new FileOutputStream(data));
			DataInputStream dt = new DataInputStream(new FileInputStream(data));

			for (int i = 'a'; i <= 'd'; i++) {
				dd.writeChar(i); // 출력
				dd.writeUTF(animals[i - 'a']);
			}

			for (int i = 'a'; i <= 'd'; i++) {
				char c = dt.readChar(); // 읽을 때
				String ss = dt.readUTF();
				System.out.printf("%c : %s\n", c, ss);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
