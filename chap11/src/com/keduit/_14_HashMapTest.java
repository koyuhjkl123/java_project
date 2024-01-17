package com.keduit;

import java.util.HashMap;
import java.util.Map;

public class _14_HashMapTest {

	public static void main(String[] args) {

//		불변성을 가진 map 참조변수
		Map<String, Integer> map = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);

//		map 참조변수를 참조한 fruits 참조변수
		Map<String, Integer> fruits = new HashMap<String, Integer>(map);

		System.out.println("현재 " + fruits.size() + "종류의 과일이 있습니다.");
		
		fruits.remove("바나나"); // HashMap는 추가, 제거, 수정이 가능하다.
		System.out.println("바나나 제거 후 " + fruits.size());

		
		fruits.put("망고", 2); // 망고 추가
		System.out.println("망고 추가 후 : " + fruits);
		
		fruits.clear(); // 모든 원소 제거
		System.out.println("clear 이후 : " + fruits);
	}

}
