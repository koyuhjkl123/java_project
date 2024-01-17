package com.keduits;

import java.util.HashMap;
import java.util.Map;

public class Exam06_HashMap {

	public static void main(String[] args) {

		Map<String, String> mp = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");

		Map<String, String> map = new HashMap<>(mp);

		System.out.println("변경 전 : " + map);
		
//		람다식을 표현하여 매개변수(k,v) key : 키값, value : 값
//		값은 영문자이기 때문에 value을 toUpperCase() 하면 대문자로 변경됨
		map.replaceAll((key, value) -> value.toUpperCase());
		System.out.println("변경 후 : " + map);
		
		

	}

}
