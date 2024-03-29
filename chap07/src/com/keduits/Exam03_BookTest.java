package com.keduits;

import java.util.Arrays;

public class Exam03_BookTest {

	public static void main(String[] args) {

		Exam03_Books[] book = { 
				new Exam03_Books(15000), // 0번째
				new Exam03_Books(50000),  // 1번째
				new Exam03_Books(20000)}; // 2번쨰
		
//		Arrays.sort(book);
		int[] books = new int[3]; // 각 인자값을 넣기 위한 int 배열

		System.out.println("정렬 전");
		for(int i=0; i < books.length; i++) {
			books[i] = book[i].getPrice();
			book[i].sort(); // 
		}
		
		Arrays.sort(books); // int 배열의 값을 넣는다.
		System.out.println("정렬 후");
		for (Exam03_Books b : book) {
			for(int i=0; i < books.length; i++) {
				book[i] = new Exam03_Books(books[i]);
			}
		}

		for(int i=0; i < books.length; i++) {
			book[i].sort();
		}
	}

}
