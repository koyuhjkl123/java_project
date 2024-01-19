package keduit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonPaserTest {

	public void jsonparsingl() throws ParseException {

		// 단순한 구조의 json을 파싱하기
		String jsonString = "{\"title\": \"how to get stroage size\","
				+ "\"url\": \"https://code.com/ko/get-free-and-total-size-of-volumes-in-android\","
				+ "\"draft\": false," + "\"star\": 10" + "}";

		// jsonObject를 가져와서 읽어옴
		JSONParser paser = new JSONParser();

		Object obj = paser.parse(jsonString);
		JSONObject jsonobj = (JSONObject) obj;

		String title = (String) jsonobj.get("title");
		String url = (String) jsonobj.get("url");
		Boolean draft = (Boolean) jsonobj.get("draft");
		Long star = (Long) jsonobj.get("star");
		
		System.out.println("title : " + title);
		System.out.println("url : " + url);
		System.out.println("draft : " + draft);
		System.out.println("star : " + star + "\n");

	}

	
	public void jsinPasing2() throws ParseException {
		
		String jsonString =
		        "{"
		        +   "\"post1\": {"
		        +       "\"title\": \"how to get stroage size\","
		        +       "\"url\": \"https://code.com/ko/get-free-and-total-size-of-volumes-in-android\","
		        +       "\"draft\": false"
		        +"  },"
		        +   "\"post2\": {"
		        +       "\"title\": \"Android Q, Scoped Storage\","
		        +       "\"url\": \"https://code.com/ko/android-q-scoped-storage\","
		        +       "\"draft\": false"
		        +   "}"
		        +"}";
		
		JSONParser paser = new JSONParser();
		Object obj = paser.parse(jsonString); // try ~ catch
		JSONObject jsonobj = (JSONObject) obj;
		
		Object post1obj = jsonobj.get("post1");
		JSONObject post1 = (JSONObject)post1obj;
		
		String title1 = (String) post1.get("title");
		String url1 = (String) post1.get("url");
		Boolean draft1 = (Boolean) post1.get("draft");
		
		System.out.println("title1 : " + title1);
		System.out.println("url1 : " + url1);
		System.out.println("draft1 : " + draft1 + "\n");
		
		
		Object post2obj = jsonobj.get("post2");
		JSONObject post2 = (JSONObject)post2obj;
		
		String title2 = (String) post2.get("title");
		String url2 = (String) post2.get("url");
		Boolean draft2 = (Boolean) post2.get("draft");
		
		System.out.println("title2 : " + title2);
		System.out.println("url2 : " + url2);
		System.out.println("draft2 : " + draft2 + "\n");
	}
	
	public void jsonPasing3() throws ParseException {

	String jsonString =
		    "{"
		    +   "\"posts\": ["
		    +       "{"
		    +           "\"title\": \"how to get stroage size\","
		    +           "\"url\": \"https://code.com/ko/get-free-and-total-size-of-volumes-in-android/\","
		    +           "\"draft\": false"
		    +       "},"
		    +       "{"
		    +           "\"title\": \"Android Q, Scoped Storage\","
		    +           "\"url\": \"https://code.com/ko/android-q-scoped-storage/\","
		    +           "\"draft\": false"
		    +       "},"
		    +       "{"
		    +           "\"title\": \"How to parse JSON in android\","
		    +           "\"url\": \"https://code.com/ko/how-to-parse-json-in-android/\","
		    +           "\"draft\": true"
		    +       "}"
		    +   "]"
		    +"}";
	
	
	JSONParser paser = new JSONParser();
	JSONObject jsonobj = (JSONObject) paser.parse(jsonString); // try ~ catch
	JSONArray jsonarr = (JSONArray)jsonobj.get("posts");
	for(int i=0; i < jsonarr.size(); i++) {
		JSONObject arrobj = (JSONObject) jsonarr.get(i);
		
		String title = (String) arrobj.get("title");
		String url = (String) arrobj.get("url");
		Boolean draft = (Boolean) arrobj.get("draft");
		
		System.out.println("title : " + title);
		System.out.println("url : " + url);
		System.out.println("draft : " + draft);
	}
	
	
	
	
	
//	 최, 상위의 posts를 가져 오자
	
	
	
	}
	public static void main(String[] args) throws ParseException {
		
		JsonPaserTest jt = new JsonPaserTest();
		
		jt.jsonparsingl();
		System.out.println("----- 1. 메소드 끝남 -----");
		jt.jsinPasing2();
		System.out.println("----- 2. 메소드 끝남 -----");
		jt.jsonPasing3();
		System.out.println("----- 3. 메소드 끝남 -----");

	}

}
