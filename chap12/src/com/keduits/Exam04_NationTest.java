package com.keduits;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.keduit.Nation;
import com.keduit.Type;

public class Exam04_NationTest {

	public static void main(String[] args) {
		
//		Nation.nations에 리스트을 스트림으로 생성
		Stream<Nation> list = Nation.nations.stream();
		
//		Map 타입과, 문자열 타입인 m2 
		Map<Type, String> m2 = list.collect(
//				LAND, ISLAND 그룹화한다.
				Collectors.groupingBy(Nation::getType,
//						Nation에 있는 getName을 매핑하고 콤마, 공백 후 출력
						Collectors.mapping(Nation::getName, Collectors.joining(", "))));

//		육지에 있는 나라이름만 추출하라고 했으니 get으로 Land값에 해당되는 값 추출
		System.out.println(m2.get(Type.LAND));
	}

}
