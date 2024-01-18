package com.test;

public class Exam01_BookTest {

	public static void main(String[] args) {

		Exam01_Drink drinks = new Exam01_Drink();
		Exam01_Book_Rental bookTest = new Exam01_Book_Rental();
		
		bookTest.book_rental = new Exam01_Book_Rental();
		
		System.out.println(bookTest);
		bookTest.BookAdd("자바프로그래밍");
		bookTest.BookAdd("자바프로그래밍");
		System.out.println(bookTest);
		bookTest.BookrRemove("자바프로그래밍");
		System.out.println(bookTest);
		drinks.DrinkAdd("콜라", 2500);
		System.out.println(drinks);
		drinks.DrinkRemove("캔맥주", 3500);
		System.out.println(drinks);
		
		bookTest.BookIsRental("자료구조");
		bookTest.BookIsRental("자료구조");
		System.out.println(bookTest);
		
	}

}
