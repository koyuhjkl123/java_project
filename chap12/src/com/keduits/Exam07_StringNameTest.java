package com.keduits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exam07_StringNameTest {

	public static void main(String[] args) {
		
//		리스트 형태인 String타입 s1을 각 문제에 있는 값
		List<String> s1 = new ArrayList<String>(Arrays.asList(
				"민국", "지우", "하준", "지우", "하준", "지우"));
		
//		Map 이름이 있는 문자열과 이름의 단어 수를 카운팅 해야 되기 때문에 Long타입 
//		s1.stream 타입으로 변환 후 collect(Collectors에 있는 그룹핑
		Map<String, Long> s2 = s1.stream().collect(
//		groupingBy(t - > t, : String 타입인 이름을 출력 / 첫번째 매개변수 그룹화 기준
//		groupingByCollectors.counting() : 해당 그룹화 기준된 이름의 빈도수를 카운팅
//		String 타입 : t -> t,   Long :  Collectors.counting() 카운팅의 메서드는
//		Long 타입이기 때문에 Map 타입도 Long으로 해야한다.
				Collectors.groupingBy(t -> t , Collectors.counting()));
		
		System.out.println(s2);
		
	}

}
