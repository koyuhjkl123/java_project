package com.keduit;

public class Book {
	
	private int bookid; // 고유 id
	private String bookname; // 책 이름
	private boolean bookisrental; // 책 대여 여부
	private int price; // 책 가격
	
	
	public Book(int bookid, String bookname, boolean bookisrental, int price) {
		
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookisrental = bookisrental;
		this.price = price;
	}


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	public boolean isBookisrental() {
		return bookisrental;
	}


	public void setBookisrental(boolean bookisrental) {
		this.bookisrental = bookisrental;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book[bookid=" + bookid + ", bookname=" + bookname
				+ ", publisher = " + bookisrental + ", price=" + price + "]";
	}
	
	
	

}
