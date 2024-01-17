package com.keduits;

public class Exam03_Books{

	//
	int price; // 책의 가격

	public Exam03_Books(int price) {
		this.price = price;
	}

	public void sort() { // 출력하기 위함 메소드
		System.out.printf("Book [price=%d]\n", price);
	}

	int getPrice() { // 값 반환을 하기 위한 get 메소드
		return price;
	}

}
