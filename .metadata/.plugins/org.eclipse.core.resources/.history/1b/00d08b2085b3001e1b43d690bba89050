package com.keduits;

import java.util.Scanner;

public class Exam02_Interrup {

	public static void main(String[] args) {
		
		int number = 0;
		Interrup t = new Interrup();
		Scanner in = new Scanner(System.in);
		
		t.start();
		t.number = in.nextInt();
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			t.interrupt();
		}
		

		
	}

}
