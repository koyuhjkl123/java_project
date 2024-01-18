package com.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JOptionPane;

public class Exam01_Book_Rental extends Exam01_Book  {

//	책, 대여, 반납

	boolean isrental = false; // 책 대여 여부
	private static int isInt_rantal = 7; // 대여 기간 7일 고정
	String book_name; // 책 이름
	Date book_return_date; // 반납 예정일

	Exam01_Book Book_lists;
//	반납기간은 항시 일수 해당 지점에 12시
	LocalDate today;

	public Exam01_Book_Rental() {
	};

	public Exam01_Book_Rental(String book_name, boolean isrental) {
		super(book_name, isrental);
		this.book_name = book_name;
		this.isrental = isrental;
	}

	public String getBookName() {
		return book_name;
	}

	public boolean getIsRental() {
		return isrental;
	}

	public int getIsIntRantal() {
		return isInt_rantal;
	}
	
	public void setBookName(String book_name) {
		this.book_name = book_name;
	}
	
	public void setIsRental(boolean isrental) {
		this.isrental = isrental;
	}
	
	public LocalDate getToday() {
		today = LocalDate.now();
		LocalDate returntoday = today.plusDays(7);
		
		return returntoday;
	}

	public void BookIsRental(String bookname) {
//		책 대여가 가능한지 여부확인
		boolean isbook = false;
		
		// 현재 날짜 출력
		today = LocalDate.now(); 
		
//		7일 후 날짜 출력
		LocalDate returntoday = today.plusDays(7);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 String formattoday = returntoday.format(formatter);
		 
		for(int i=0; i < books.size(); i++) {
//		for (Exam01_Book book : books) {
			StringBuilder ab = new StringBuilder();
//			대여할 책이 기존 책에 있는지
				if (books.get(i).getTitle().equals(bookname)) {
					isbook = true;
//				해당 책이 대여한게 있는지
					if (books.get(i).book_isrental) {
						JOptionPane.showMessageDialog(null, "이미 대여된 " + books.get(i).getTitle() + "책입니다.", "북 카페",
								JOptionPane.PLAIN_MESSAGE);
//					책이 있고 대여한게 없다면 대여 가능
					} else {
						JOptionPane.showMessageDialog(null, "해당" + books.get(i).getTitle() + " 대여가 가능합니다.",
								"북 카페", JOptionPane.PLAIN_MESSAGE);
						books.get(i).book_isrental = true; // 해당 책은 대여가 됬다.
						book_rental.setBookName(bookname);
						book_rental.setIsRental(books.get(i).book_isrental);
					}
					break;
				}
		}
	}
	
	
	
	
	
	
	

}
