package keduit;

import java.sql.DriverManager;

public class Ailrport extends User {

	public Ailrport() {
		try { // 사용자(user)가 검색을 하기 위해 사용되는 생성자
			String driver = "com.mysql.cj.jdbc.Driver";
			String sql_url = "jdbc:mysql://localhost:3306/sqldb";
			setUserid("root");
			setPwd("1234");
			Class.forName(driver);
			con = DriverManager.getConnection(sql_url, getUserid(), getPwd());
			System.out.println("로그인 성공 하셨습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	};
	public static void main(String[] args) throws Exception {

		Ailrport a = new Ailrport(); // 생성자
//		a.Database();
		a.SqlSelect(); // 

	}
}






//public void Database() {
//	String result = "";
//
//	try {
//		URL url = new URL(
//				"https://apis.data.go.kr/1160100/service/GetStockSecuritiesInfoService/getStockPriceInfo?serviceKey=B0n71QWQYKWw2A85EXRc5IQbV1P29e6lKpPlaefJZR4ls84%2BKV8HhzYR7pC6oK0wh0CUhKHZMR4z79CrhJhGUQ%3D%3D&numOfRows=150000&resultType=json&beginBasDt=20231225&endBasDt=20240101&mrktCls=KOSDAQ");
//		// 응답 형식을 JSON으로 설정
//		BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
//		result = bf.readLine();
//
//		JSONParser parser = new JSONParser();
//		JSONObject jsonObj = (JSONObject) parser.parse(result); // json가져온거 파싱함 반환값이 object니까 jsonobject타입으로 형변환해서
//																// jsonobj에 넣어줌
//
//		JSONObject response = (JSONObject) jsonObj.get("response"); // jsonobj에서 response 꺼내서 그것도 object타입이니까
//																	// jsonobject타입으로 형변환
//		JSONObject body = (JSONObject) response.get("body"); // get을 어디서해오느냐 주의!!
//		JSONObject items = (JSONObject) body.get("items");
//		JSONArray item = (JSONArray) items.get("item"); // 이건 배열이였으니까.
//
//		String sql_create = "create table Stock2 (" + "num int auto_increment not null primary key,"
//				+ "itmsNm VARCHAR(40) not null," + "basDt VARCHAR(40) not null," + "clpr VARCHAR(40) not null,"
//				+ "vs VARCHAR(40) not null," + "fltRt VARCHAR(40) not null," + "mkp VARCHAR(40) not null,"
//				+ "hipr VARCHAR(40) not null," + "lopr VARCHAR(40) not null," + "trqu VARCHAR(40) not null,"
//				+ "mrktTotAmt VARCHAR(40) not null)";
//
//		try {
//			Statement stmt = con.createStatement();
//			stmt.executeUpdate(sql_create);
//			System.out.println("정보 업데이트 완료되었습니다.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		for (int i = 0; i < item.size(); i++) {
//			JSONObject itmsNm = (JSONObject) item.get(i);
//			String itmsNms = (String) itmsNm.get("itmsNm"); // 종목명
//			String mrktTotAmt = (String) itmsNm.get("mrktTotAmt"); // 시가총액
//			String mrktCtg = (String) itmsNm.get("mrktCtg"); // 시장 구분
//			String clpr = (String) itmsNm.get("clpr"); // 종가
//			String basDt = (String) itmsNm.get("basDt"); // 기준일자
//			String vs = (String) itmsNm.get("vs"); // 대비
//			String fltRt = (String) itmsNm.get("fltRt"); // 등락률
//			String trqu = (String) itmsNm.get("trqu"); // 거래량
//			String mkp = (String) itmsNm.get("mkp"); // 시가
//			String hipr = (String) itmsNm.get("hipr"); // 고가
//			String lopr = (String) itmsNm.get("lopr"); // 저가
//
//			setItmsNms(itmsNms);
//			setBasDt(basDt);
//			setClpr(clpr);
//			setVs(vs);
//			setFltRt(fltRt);
//			setMkp(mkp);
//			setHipr(hipr);
//			setLopr(lopr);
//			setTrqu(trqu);
//			setMrktTotAmt(mrktTotAmt);
//			System.out.print(itmsNms + "  " + basDt + "  " + clpr + "  " + vs + "  " + fltRt + "  " + mkp + "  "
//					+ hipr + "  " + lopr + " " + trqu + " " + mrktTotAmt + "\n"); // 날짜, 종가
//
//			String sql_insert = "insert into Stock2(itmsNm, basDt, clpr, vs, fltRt, mkp, hipr, lopr, trqu, mrktTotAmt) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//
//			PreparedStatement pstmt = con.prepareStatement(sql_insert);
//			pstmt = con.prepareStatement(sql_insert);
//			pstmt.setString(1, getItmsNms());
//			pstmt.setString(2, getBasDt());
//			pstmt.setString(3, getClpr());
//			pstmt.setString(4, getVs());
//			pstmt.setString(5, getFltRt());
//			pstmt.setString(6, getMkp());
//			pstmt.setString(7, getHipr());
//			pstmt.setString(8, getLopr());
//			pstmt.setString(9, getTrqu());
//			pstmt.setString(10, getMrktTotAmt());
//			int result_sum = pstmt.executeUpdate();
//			if (result_sum == 1) {
//				System.out.println("정보 업데이트 완료되었습니다.");
//			} else {
//				System.out.println("정보 업데이트 실패되었습니다.");
//			}
//		}
//
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//}
