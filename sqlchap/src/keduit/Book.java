package keduit;

public class Book {
	
	
	private int bookid;
	private String bookname;
	private String publisher; // 출판사
	private int price;
	
	
	public Book(int bookid, String bookname, String publisher, int price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	
	
	public int getBookId() {
		return bookid;
	}
	public void setBookId(int bookid) {
		this.bookid = bookid;
	}
	
	public String getBookName() {
		return bookname;
	}
	public void setBookName(String bookname) {
		this.bookname = bookname;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
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
				+ ", publisher = " + publisher + ", price=" + price + "]";
	}
	
}
