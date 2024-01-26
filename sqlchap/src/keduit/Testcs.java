package keduit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Testcs {
	
	Connection con;
	public Testcs() throws Exception {

		String driver = "com.mysql.cj.jdbc.Driver";
		String sql_url = "jdbc:mysql://localhost:3306/sqldb";
		String userid = "root";
		String pwd = "1234";

			Class.forName(driver);
			con = DriverManager.getConnection(sql_url, userid, pwd);
			System.out.println("연결 성공 하였습니다.");

	}
	
	public void database() {
		String result = "";
		try {
			URL url = new URL("https://apis.data.go.kr/1741000/stats/exfc/getStats?serviceKey=B0n71QWQYKWw2A85EXRc5IQbV1P29e6lKpPlaefJZR4ls84%2BKV8HhzYR7pC6oK0wh0CUhKHZMR4z79CrhJhGUQ%3D%3D");
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			result = bf.readLine();
			System.out.println(result);
			
			JSONParser parser = new JSONParser();
			JSONObject jsonobj = (JSONObject) parser.parse(result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		Testcs t = new Testcs();
		t.database();
	}
	
	


}
