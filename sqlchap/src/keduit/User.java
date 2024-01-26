package keduit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

public class User extends Admin{
//		유저 메뉴얼
	
	@Override
	public void SqlSelect() {
		System.out.println("---------- 주식시세정보 ----------");
		System.out.print("1. 이용자  |  2. 관리자");

		int user = sc.nextInt();
		if (user == 1) {
			while (true) { // 5번 선택 시 끝남
				System.out.println("----------- 주식시세정보 (-검색-) --------");
				System.out.println("1. 종목명 검색  |  2. 특정 날짜 검색 | 3. 시가총액 검색  | 4. 거래량 검색  | 5. 검색 종료");

				int user_select = sc.nextInt();
//				sc.nextLine(); // 개행 문자 소비
				if (user_select == 1) {
					System.out.println("---------- 종목명(-검색-)을 선택하셨습니다! --------");
					System.out.println("종목명을 입력하세요 : ");
					String name = sc.next();
					System.out.println(name);
					UserItmsNmsSelect(name);
				} else if (user_select == 2) {
					System.out.println("---------- " + "특정 날짜 검색 " + "(-전체검색-) ----------");
					System.out.println("날짜 : 2023년 12월 4일 ~ 2023년 12월 28일");
					System.out.println("날짜 입력 양식 예시 : 20231212");
					System.out.println("날짜 입력 시 보여주는 종목 수 : 100개");
					String date = sc.next();
					UserSelectTwo(date);
				} else if (user_select == 3) {
					System.out.println("---------- " + "시가총액 순위 " + "(-시가총액 검색-) ----------");
					System.out.println("----- 원하시는 시가총액 정보를 입력하세요 -----");
					System.out.println("1. 시가총액 높은 순  2. 시가총액 낮은 순");
					int user_select_mt = sc.nextInt();
					sc.nextLine(); // 개행 문자
					System.out.println("1. 10위내  2. 50위내  3. 100위내");
					int user_select_rank = sc.nextInt();
					UserSelectMrkttotamt(user_select_mt, user_select_rank);

				} else if (user_select == 4) {
					System.out.println("---------- 거래량 검색 (--검색--) ----------");
					System.out.println("--------- 원하시는 거래량 정보를 입력하세요");
					System.out.println("1. 거래량 높은 순  2. 거래량 낮은 순");
					int user_select_trqu = sc.nextInt();
					sc.nextLine(); // 개행 문자
					System.out.println("1. 10위내  2. 50위내  3. 100위내");
					int user_select_rank = sc.nextInt();
					UserSelectTrqu(user_select_trqu, user_select_rank); // 거래량 메서드
				} else if (user_select == 5) {
					System.out.println("해당 검색을 종료하시겠습니까?");
					System.out.println("1. 네  |  2. 아니요");
					int user_select_end = sc.nextInt();

					if (user_select_end == 1) {
						System.out.println("검색창을 종료하였습니다.");
						break;
					} else if (user_select_end == 2) {
						System.out.println("처음 선택지로 넘어갑니다.");
						continue;
					}
				}

			} // User 사용자 끝
//			관리자 권한으로 사용
		} else if (user == 2) {
			String userid_is = ""; // 아이디 입력
			String pwd_is = ""; // 비밀번호 입력
			System.out.println("---------- 주식 시세정보(관리자) ----------");

			boolean admin_login = false;

			for (int i = 0; i < 5;) {
				System.out.print("아이디를 입력하세요 : ");
				userid_is = sc.next(); // 아이디 입력

				System.out.print("비밀번호를 입력하세요 : ");
				pwd_is = sc.next(); // 비밀번호 입력
				if ((userid_is.equals(getUserid())) && (pwd_is.equals(getPwd()))) {
					System.out.println("관리자님 로그인 하셨습니다.");
					admin_login = true;
					break;
				} else {
					System.out.println("로그인이 실패하셨습니다.");
					continue;
				}
			}

			while (admin_login) {
				try {
					int adminstor_number;

					System.out.println("---------- 관리자 주식 시세정보 ----------");
					System.out.println("1. 추가하기  2. 수정하기  3. 삭제하기  4. 검색하기  5. 로그아웃");
					sc.nextLine();
					adminstor_number = sc.nextInt(); // 관리자 선택

					if (adminstor_number == 1) {
						AdminInsert(); // 추가하기
					} else if (adminstor_number == 2) {
						AdminUdate(); // 수정하기
					} else if (adminstor_number == 3) {
						AdminDelete(); // 삭제하기
					} else if (adminstor_number == 4) { 
						AdminSelect(); // 검색하기
					} else if (adminstor_number == 5) {
						System.out.println("로그아웃 하였습니다.");
						break;
					} else {
						System.out.println("인식");
					}

				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("로그인 정보가 틀렸습니다.");
					continue;
				}
			}
		}
	}
	
	
	public void SelectUser(ResultSet rs) {
		try {

			DecimalFormat decimalFormat = new DecimalFormat("#,##0원");

			do {
				if (rs.getString(9).length() >= 5) {
					// SQL에서 억 단위로 나눈 후 길이가 5이상이라면 조로 기준을 나눈다.
					System.out.printf("%-20s %-12s %-8s %-9s %-9s %-9s %-9s %-9s\t %-15s\n", rs.getString(1),
							rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
							rs.getString(7), decimalFormat.format(Integer.parseInt(rs.getString(8))),
							rs.getString(9).substring(0, rs.getString(9).length() - 4) + "조 "
									+ rs.getString(9).substring(rs.getString(9).length() - 4) + "억");
				} else {
					System.out.printf("%-20s %-12s %-8s %-9s %-9s %-9s %-9s %-9s\t %-15s\n", rs.getString(1),
							rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),
							rs.getString(7), decimalFormat.format(Integer.parseInt(rs.getString(8))),
							rs.getString(9) + "억");
				}
			} while (rs.next());

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	@Override
	public void UserItmsNmsSelect(String itmsNms_name) {

		Statement stmt;
		String sql = "SELECT basDt, clpr, vs, fltRt, mkp, hipr, lopr, trqu, cast(cast(mrktTotAmt as signed) / 100000000 as signed) "
				+ "FROM stock1 WHERE TRIM(itmsNm) like ? order by basDt ASC";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + itmsNms_name.trim() + "%");
			ResultSet rs = pstmt.executeQuery();

			  if (!(rs.next())) {
		            System.out.println();
		            System.out.println("입력하신 종목명은 존재하지 않습니다.");
		        } else {
		            System.out.printf("%-20s %-12s %-8s %-9s %-9s %-9s %-9s %-9s %-15s\n", "날짜", "종가", "대비", "등락률", "시가",
		                    "고가", "저가", "거래량", "시가총액");
		            SelectUser(rs); // 출력메소드
		        }
			
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void UserSelectTwo(String date) {
//		2. 특정 날짜 검색을 하기 위한 메서드

		String sql = "select itmsNm, clpr, vs, fltRt, mkp, hipr, lopr, trqu, cast(cast(mrktTotAmt as signed) / 100000000 as signed) from stock1 where basDt = '"
				+ date + "' limit 100";
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			  if (!(rs.next())) {
		            System.out.println();
		            System.out.println("입력된 날짜가 틀렸습니다. 다시 입력하시길 바랍니다");
		        } else {
		            System.out.printf("  종목명 \t\t 종가 \t 대비 \t 등락률 \t 시가 \t 고가 \t 저가 \t  거래량 \t 시가총액\n");
		            SelectUser(rs);
		        }
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void UserSelectMrkttotamt(int order, int rank) {
//		시가 총액 순위 메서드
//		1. 시가 총액 높은 순 2. 시가 총액 낮은 순
//		"1. 10위내  2. 50위내  3. 100위내"
		String order_by = "";
		String max_is = "";
		int limit = 0;
		if (order == 1) {
			order_by = "desc";
			max_is = "Max";
		} else if (order == 2) {
			order_by = "ASC";
			max_is = "min";
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		if (rank == 1) {
			limit = 10;
		} else if (rank == 2) {
			limit = 50;
		} else if (rank == 3) {
			limit = 100;
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

		String sql = "SELECT itmsNm, cast(" + max_is
				+ "(CAST(mrktTotAmt AS SIGNED)) / 100000000 as signed) AS min_mrktTotAmt " + "FROM stock1 "
				+ "GROUP BY itmsNm " + "ORDER BY min_mrktTotAmt " + order_by + " limit " + limit;

		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.printf("  %-20s %-12s \n", "종목명", "시가총액");

			while (rs.next()) {

				System.out.print("  " + rs.getString(1) + "\t\t");
				if (rs.getString(2).length() >= 5) {
					System.out.print(rs.getString(2).substring(0, rs.getString(2).length() - 4) + "조 "
							+ rs.getString(2).substring(rs.getString(2).length() - 4) + "억");
				} else {
					System.out.print(rs.getString(2) + "억");
				}
				System.out.println();
			}
			
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	@Override
	public void UserSelectTrqu(int number, int rank) {
//		4. 거래량 검색 기능 메서드
//		매개변수1 : number -> 1. 거래량 높은 순  2. 거래량 낮은 순
//		매개변수2 : rank  -> 1. 10위내,  2. 50위내  3. 100위내 

		String Max_Min = ""; // 최대값, 최소값
		String Order_by = ""; // 오름차순, 내림차순
		int limit_rank_number = 0; // rank 몇위까지 보여줄것인가
		int number_rank = 0; // 10, 50, 100 순위 내에 입력

//		오름차순, 내림차순 결정
		if (number == 1) {
			Order_by = "desc";
			Max_Min = "MAX";
		} else if (number == 2) {
			Order_by = "asc";
			Max_Min = "MIN";
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
//		limit의 순위 결정
		if (rank == 1) {
			limit_rank_number = 10;
		} else if (rank == 2) {
			limit_rank_number = 50;
		} else if (rank == 3) {
			limit_rank_number = 100;
		}

		String sql = "select itmsNm, " + Max_Min + "(cast(trqu as signed)) as max_trqu" + " from stock1"
				+ " group by itmsNm" + " order by max_trqu " + Order_by + " limit " + limit_rank_number;

		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			DecimalFormat decimalFormat = new DecimalFormat("#,##0원");

			while (rs.next()) {
				System.out.print(rs.getString(1) + "   \t");
				System.out.print(decimalFormat.format(Integer.parseInt(rs.getString(2))) + "   \t");
				System.out.println();
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	
}
