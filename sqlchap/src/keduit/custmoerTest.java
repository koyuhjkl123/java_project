package keduit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class custmoerTest {

	Connection con;

	public custmoerTest() throws Exception {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sqldb";
		String userid = "root";
		String pwd = "1234";

		Class.forName(driver);
		System.out.println("연결");

		con = DriverManager.getConnection(url, userid, pwd);
	}

	private void selectcustomer(String table) throws Exception {

//		전체 검색 시 
		String sql = "select * from " + table;
		int count = 0;
		
//		DatabaseMetaData 클래스 : 데이터베이스의 구조, 테이블, 컬럼, 제약 조건 등에 대한 정보얻기 위한 클래스
		 java.sql.DatabaseMetaData metaData = con.getMetaData();
		
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM " + table);
//		getColumns: 특정 테이블의 컬럼 정보를 조회
		ResultSet resultSet = metaData.getColumns(null, null, table, null);
//		getColumns : 매개변수의 역할 / null을 지정하면 해당 정보는 고려하지 않음
//		첫번째 매개변수 : 데이터베이스 이름을 나타냄
//		두번째 매개변수 : 스키마(데이터베이스 사용자의 그룹) 패턴을 지정 쉽게말해 사용자의 이름을 나타난다고 함
//		셋번째 매개변수 : 테이블명을 지정
//		

//		컬럼의 수 만큼 카운팅 // book 컬럼이 4개라면 카운팅 수는 4
		while(resultSet.next()) {
			count++;
		}
		System.out.println(count);
		while (rs.next()) {
			for(int i =1; i <= count; i++) { // 카운팅된 수만큼 출력
//				i가 1부터 시작하는 이유는 데이터 베이스는 1부터 시작해서 그럼
				System.out.print("\t"+rs.getObject(i));
			}
			System.out.println();
		}
		rs.close();
		stmt.close();

	}

	private void selectnum(customer c) throws Exception {

		String sql = "select * from Customer where name = ?";

		PreparedStatement pstmt;
		pstmt = con.prepareStatement(sql);
		String name = (c.getName() != null) ? c.getName() : "";
		pstmt.setString(1, name);

		ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.print("\t" + rs.getString(2));
			}

		rs.close();
		pstmt.close();

	}
	
	public void insertct() throws Exception {
		String sql = "insert into Customer(custid, name, address, phone) " + 
					"values (null, '박세리', '대한민국 대전', '010-1111-2222')";
		
		Statement stmt;
		
		stmt = con.createStatement();
		
		int result = stmt.executeUpdate(sql);
		
		if(result == 1) {
			System.out.println("등록완료!");
		}else {
			System.out.println("등록 실패!");
		}
		
		stmt.close();
	}
	
	public void deletes(customer c) throws Exception {
		String sql = "delete from Customer where name = ?";
		
		PreparedStatement pstmt;
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, c.getName());
		
		int result = pstmt.executeUpdate();
		
		if(result == 1) {
			System.out.println("삭제 완료!");
		}else {
			System.out.println("삭제 실패!");
		}
	}
	
	public void update(customer c) throws Exception {
		
		String sql = "update Customer set phone = ? " +
				"where name = ?";
		
		PreparedStatement pstmt;
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, c.getPhone());
		pstmt.setString(2, c.getName());
		
		int result = pstmt.executeUpdate();
		
		if(result == 1) {
			System.out.println("등록성공");
		}else {
			System.out.println("등록 실패");
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String names = sc.nextLine();
		customer c = new customer(0, names, "대한민국", "000-8500-0001");
		Book book = new Book(0, "데이터베이스", "한교 출판사", 30000);
		custmoerTest ct = new custmoerTest();

		ct.selectcustomer(names);
//		ct.selectnum(c);
//		ct.insertct();
//		ct.deletes(c);
//		ct.update(c);

	}

}
