package keduit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Campping {

	
	public static void main(String[] args) {
		
		
		String result = "";
		
		try {
			URL url = new URL("https://apis.data.go.kr/B551011/GoCamping/basedList?numOfRows=100&pageNo=2&MobileOS=ETC&MobileApp=appApp&serviceKey=B0n71QWQYKWw2A85EXRc5IQbV1P29e6lKpPlaefJZR4ls84%2BKV8HhzYR7pC6oK0wh0CUhKHZMR4z79CrhJhGUQ%3D%3D&_type=json");
			BufferedReader bf;
			bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			
			result = bf.readLine();
//			System.out.println(result);
//			System.out.println();
			
			JSONParser paser = new JSONParser();
			JSONObject jsonobj = (JSONObject) paser.parse(result);
			JSONObject response = (JSONObject) jsonobj.get("response"); // response 키값
			JSONObject body = (JSONObject) response.get("body"); // response 키값의 있는 body키값
			JSONObject items = (JSONObject) body.get("items"); // response 키값의 있는 body키값의 items키값
			JSONArray item = (JSONArray) items.get("item"); // response 키값의 있는 body키값의 items키값에 있는 배열
			
			for(int i=0; i < item.size(); i++) {
				JSONObject capping = (JSONObject) item.get(i);
				System.out.println(i++);
				String facltNm = (String) capping.get("facltNm");
				System.out.println("이름 : " + facltNm);
				
				String lineIntro = (String) capping.get("lineIntro");
				System.out.println("소개 : " + lineIntro);
				
				String addr1 = (String) capping.get("addr1");
				System.out.println("주소 : " + addr1);
				System.out.println("------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
