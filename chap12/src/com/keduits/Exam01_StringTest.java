package com.keduits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam01_StringTest {

	public static void main(String[] args) {
		
		List<String> s1 = new ArrayList<String>(Arrays.asList(
				"갈매기", "나비", "다람쥐", "라마"));
		
//		리스트인 타입이 String s1을 stream을 하고
//		filter : 해당 문자열 길이가 2인 값만 추출 
		s1.stream().filter(s-> s.length() == 2)
		.forEach(s-> System.out.print(s + " "));

	}

}
