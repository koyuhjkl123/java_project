package keduit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookList {
	Connection conn; // sql
	
	 public BookList() throws Exception {
		 String driver = "com.mysql.cj.jdbc.Driver"; // 다운로드한 jar파일명
		 String url ="jdbc:mysql://localhost:3306/sqldb";
		 String userid = "root"; // 사용자
		 String pwd = "1234"; // 비밀번호
		 
		 Class.forName(driver);
		 System.out.println("드라이버 연결 성공");
		 System.out.println("드라이버 연결 준비.....");
		 conn = DriverManager.getConnection(url, userid, pwd);
//		 url : 어디에 있는지
//		 userid : 사용자
//		 pwd : 비밀번호
		 System.out.println("드라이버 연결 성공!");
	}

	 private void selectAll() throws Exception {
		 
		 String sql = "select bookid, bookname, publisher, price from book"; // 쿼리문
		 Statement stmt = conn.createStatement();
		 ResultSet rs = stmt.executeQuery(sql); // 불러 올때
		 
		 while(rs.next()) {
			 System.out.print("\t" + rs.getInt(1)); // 1번지부터 시작함
			 System.out.print("\t" + rs.getString(2)); 
			 System.out.print("\t" + rs.getString(3)); 
			 System.out.print("\t" + rs.getInt(4));
			 System.out.println();
		 }
		 rs.close();
		 stmt.close();
//		 conn.close();
	 }
	 
	 private void insert() throws Exception {
		 Statement stmt;
		 String sql = "insert into book(bookid, bookname, publisher, price) " + 
		 "values(null, '홍길동 전', '관악출판사', '25000')";
		 
		 stmt = conn.createStatement();
		 int result = stmt.executeUpdate(sql); // insert, update등 사용
		 if (result == 1) {
			 System.out.println("정보 업데이트 완료되었습니다.");
		 }else {
			 System.out.println("정보 업데이트 실패되었습니다.");
		 }
		 
		 stmt.close();
//		 conn.close();
	 }
	 
	 private void insertBook(Book book) throws Exception {
		 
		 String sql = "insert into book(bookid, bookname, publisher, price) " +
		 "values(?,?,?,?)";
		 
		 PreparedStatement pstmt; 
		 pstmt = conn.prepareStatement(sql); // 
		 pstmt.setInt(1, book.getBookId()); // 1번 칼럼... 관련
		 pstmt.setString(2, book.getBookName());
		 pstmt.setString(3, book.getPublisher());
		 pstmt.setInt(4, book.getPrice());
		 int result = pstmt.executeUpdate();
		 
		 if(result == 1) {
			 System.out.println("다양한 레코드 등록 성공");
		 }else {
			 System.out.println("실패");
		 }
		 pstmt.close();
	 }
	 
	 private void delete() throws Exception {
		 String sql = "delete from book where bookid = 10";
		 Statement stmt;
		 
		 stmt = conn.createStatement();
		 int result =  stmt.executeUpdate(sql);
		 
		 if(result == 1) {
			 System.out.println("해당 레코드가 삭제되었습니다.");
		 }else {
			 System.out.println("해당 레코드 삭제가 실패되었습니다.");
		 }
		 stmt.close();
	 }
	 
	 private void deleteNum(int num) throws Exception {
		 String sql = "delete from book where bookid = ?";
		 PreparedStatement pstmt; // 매개변수 있을 시
		 pstmt = conn.prepareStatement(sql); // 매개변수 있을 시
		 pstmt.setInt(1, num);
		 int result = pstmt.executeUpdate();
		 
		 if(result == 1) {
			 System.out.println(num +"번 레코드 삭제 성공!");
		 }else {
			 System.out.println(num + "번 레코드 삭제 실패!");
		 }
		 pstmt.close();
	 }
	public static void main(String[] args) throws Exception {
		
//		sqldb를 가져오는 클래스
		BookList books = new BookList();
		
//		book.selectAll();
//		book.insert();
//		book.selectAll();
//		book.delete();
//		books.selectAll();
//		books.deleteNum(12);
		books.selectAll();
		
		Book book = new Book(0, "데이터베이스", "한정교 출판사", 30000);
		
		books.insertBook(book);
		books.selectAll();

	}

}
