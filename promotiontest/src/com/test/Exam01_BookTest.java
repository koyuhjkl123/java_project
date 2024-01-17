package com.test;

public class Exam01_BookTest {

//	북 카페를 이루고있는 구성요소를 클래스로 설계하세요.
//	설계를 토대로 소스코드를 작성하세요.
//	작성된 소스코드가 요구사항을 충족하도록 프로그램을 만들어 주세요.

//	구성 요소 : 북 카페, 책, 음료 < 
//	요구사항 : 이름, 주소, 여러권의 책, 다양한 음료

//	북 카페는 아래와 같이 동작을 실행한다.

//	새로운 음료를 추가하거나, 기존 음료를 삭제
//	카페의 정보를 요약하여 출력

//	정보 출력
	Exam01_Book_Rental book_rental;
	Exam01_Book book;
	Exam01_Drink drink;
	
//	책 대여 및 반납
	int book_period = 7;
	
	public static void main(String[] args) {

		Exam01_Drink drinks = new Exam01_Drink();
		Exam01_Book_Rental bookTest = new Exam01_Book_Rental();
		
		bookTest.book_rental = new Exam01_Book_Rental();
		
		bookTest.BookAdd("자바프로그래밍");
		bookTest.BookAdd("자바프로그래밍");
		System.out.println(bookTest);
		bookTest.BookrRemove("자바프로그래밍");
		System.out.println(bookTest);
		drinks.DrinkAdd("콜라", 2500);
		System.out.println(drinks);
		drinks.DrinkRemove("캔맥주", 3500);
		System.out.println(drinks);
		
		System.out.println(bookTest);
		bookTest.BookIsRental("자료구조");
		System.out.println(bookTest);
//		System.out.println(bookTest.add_book);
//		System.out.println(bookTest.books.get(3).book_isrental);
		
//		String input = JOptionPane.showInputDialog(null, "원하시는 책 제목을 입력하세요", "북 카페", JOptionPane.PLAIN_MESSAGE);
//		for(int i=0; i<books.books.size(); i++) {
//			if(books.books.get(i).getTitle().equals(input)) {
//				System.out.println("정답");
//			}else {
//				System.out.println("실패");
//			}
//		}
		
		
	}

}
