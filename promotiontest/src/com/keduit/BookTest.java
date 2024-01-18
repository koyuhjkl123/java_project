package com.keduit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookTest {

	Connection con;

	public BookTest() throws Exception {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sqldb";
		String userid = "root"; // 사용자
		String pwd = "1234"; // 비밀번호

		Class.forName(driver);
		System.out.println("드라이버 연결 성공");
		System.out.println("드라이버 연결 준비중");

		con = DriverManager.getConnection(url, userid, pwd);
		System.out.println("연결 성공");
	}

//	책을 검사하는
	private void selectName(Book book) throws Exception {

		String sql = "select * from Bookcafe where bookname = ?";
		PreparedStatement pstmt;
		pstmt = con.prepareStatement(sql);
		String bookName = (book.getBookname() != null) ? book.getBookname() : "";
		pstmt.setString(1, bookName);

		ResultSet rs = pstmt.executeQuery();

		if(rs.next()) {
			while (rs.next()) {
//			System.out.print("\t" + rs.getInt(1)); // 1번지부터 시작함
				System.out.print("\t" + rs.getString(2));
			}
		}else {
			System.out.println("찾으신 책은 없습니다.");
			
		}
		

		rs.close();
		pstmt.close();
//		con.close();
	}

	public static void main(String[] args) throws Exception {

		BookTest books = new BookTest();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("북 카페에 오신것을 환영합니다.");
		System.out.println("대여를 하고싶은 책이 있으신가요?");
		String s = sc.nextLine();
		Book book = new Book(0, s, false, 33000);
		System.out.println();

		books.selectName(book);

	}

}
