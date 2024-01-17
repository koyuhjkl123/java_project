package com.keduit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _13_MapTest {

	public static void main(String[] args) {
		
//		Map.of : of는 불변이라 추가, 삭제 불가
		Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 4
				, "포도", 10, "딸기", 1);
		
		System.out.println(fruits.size() + "종류의 과일이 있습니다.");
		System.out.println(fruits);
		
		for(String key: fruits.keySet()) {
			System.out.println(key + "가 " + fruits.get(key) + "개 있습니다.");
		}

		String key = "바나나";
		
		if(fruits.containsKey(key)) {
			System.out.println(key +"가" + fruits.get(key) + "개 있습니다.");
		}
		
		fruits.forEach((k,v) -> System.out.print(k + "(" + v+")"));
		
		// Immutable fruits 불변이라 추가, 삭제 안됨
//		fruits.put("망고", 5); 
//		fruits.remove("사과");
//		fruits.clear();
		
		System.out.println();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 20);
		map.put("불안한", 22);
		map.put("고길동", 25);
		map.put("금강산", 24);
		int age = map.get("홍길동");
		
		System.out.println(age);
		
//		키 값 얻어오기
		Set<String> keyset = map.keySet();
		
		Iterator<String> it = keyset.iterator();
		
		while(it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			System.out.println("\t " + k+" : " + v);
		}
	} 

}
