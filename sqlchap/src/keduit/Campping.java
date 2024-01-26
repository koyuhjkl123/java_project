package keduit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Campping extends Camppings{

	Connection con;
	public Campping() throws Exception {

		String driver = "com.mysql.cj.jdbc.Driver";
		String sql_url = "jdbc:mysql://localhost:3306/sakila";
		String userid = "root";
		String pwd = "548312";

			Class.forName(driver);
			con = DriverManager.getConnection(sql_url, userid, pwd);
			System.out.println("연결 성공 하였습니다.");

	}

	public void Create_movie() {
		String key = "7a63766b9de45cef62bdfc8a241d6bd2";

		String result = "";

		try {
			URL url = new URL("http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json?key="
					+ key + "&movieCd=20124039");

			BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

			result = bf.readLine();

//			System.out.println(result);
			JSONParser parser = new JSONParser();
			JSONObject jsonobj = (JSONObject) parser.parse(result);
			JSONObject movieInfoResult = (JSONObject) jsonobj.get("movieInfoResult");
			JSONObject movieInfo = (JSONObject) movieInfoResult.get("movieInfo");

			JSONArray actors = (JSONArray) movieInfo.get("actors");
			String movieCd = (String) movieInfo.get("movieCd");
			String movieNm = (String) movieInfo.get("movieNm");
			String movieNmEn = (String) movieInfo.get("movieNmEn");
			String showTm = (String) movieInfo.get("showTm");
			String openDt = (String) movieInfo.get("openDt");
			JSONArray nations = (JSONArray) movieInfo.get("nations");
			JSONArray directors = (JSONArray) movieInfo.get("directors");
			JSONArray genres = (JSONArray) movieInfo.get("genres");

			JSONObject nations_arr = (JSONObject) nations.get(0);
			JSONObject directors_arr = (JSONObject) directors.get(0);
			JSONObject genres_arr = (JSONObject) genres.get(0);
			String nationNm = (String) nations_arr.get("nationNm");
			String peopleNm = (String) directors_arr.get("peopleNm");
			String genreNm = (String) genres_arr.get("genreNm");

			System.out.println("영화코드 : " + movieCd);
			System.out.println("영화명(한글) : " + movieNm);
			System.out.println("영화명(영문) : " + movieNmEn);
			System.out.println("재생시간 : " + showTm);
			System.out.println("개봉시간 : " + openDt);
			System.out.println("제작국명 : " + nationNm);
			System.out.println("감독 : " + peopleNm);
			System.out.println("장르 : " + genreNm);
			
			setMovieCd(movieCd);
			setMovieNm(movieNm);
			setShowTm(showTm);
			setOpenDt(openDt);
			setPeopleNm(peopleNm);
			
			System.out.print("출연배우 : ");
			for (int i = 0; i < actors.size(); i++) {
				JSONObject casting = (JSONObject) actors.get(i);
				String peopleNms = (String) casting.get("peopleNm");
				System.out.print(peopleNms + "\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sql = "CREATE TABLE movie ("
	            + "movieCd VARCHAR(40) NOT NULL PRIMARY KEY,"
	            + "movieNm VARCHAR(40) NOT NULL,"
	            + "showTm VARCHAR(40) NOT NULL,"
	            + "openDt VARCHAR(40) NOT NULL,"
	            + "peopleNm VARCHAR(30) NOT NULL)";
		
		try {
			Statement stmt = con.createStatement();
			stmt.execute(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	public void inserts() throws SQLException {
		
		
		 Statement stmt;
		 String sql = "insert into movie(movieCd, movieNm, showTm, openDt, peopleNm) values(?, ?, ?, ?, ?)";
		 
		 PreparedStatement pstmt; 
		 
		 pstmt = con.prepareStatement(sql); //
		 pstmt.setString(1, getMovieCd()); // 1번 칼럼... 관련
		 pstmt.setString(2, getMovieNm());
		 pstmt.setString(3, getShowTm());
		 pstmt.setString(4, getOpenDt());
		 pstmt.setString(5, getPeopleNm());
		 int result = pstmt.executeUpdate();
		 if (result == 1) {
			 System.out.println("정보 업데이트 완료되었습니다.");
		 }else {
			 System.out.println("정보 업데이트 실패되었습니다.");
		 }
		 
	}

	public static void main(String[] args) throws Exception {
		Campping c = new Campping();
		
		
		c.Create_movie();
		
			
		c.inserts();
			

	}

}