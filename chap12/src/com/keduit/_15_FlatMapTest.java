package com.keduit;

import java.util.List;
import java.util.stream.Stream;

public class _15_FlatMapTest {

	public static void main(String[] args) {
		
		List<String> list1 = List.of("안녕", "자바!", "잘가, C++!");
		
		Stream<String> s1 = list1.stream();
		
		s1.forEach(Util::Print);
		System.out.println();
		
		s1 = list1.stream();
//		s1.flatMap(s -> Arrays.stream(s.split(" "))).forEach(Util::printWithParenthesis);
		
		List<String> list2 = List.of("좋은 아침");
		List<String> list3 = List.of("안녕! 람다", "환영! 스트림");
		
//		스트림<제네릭 타입인 List<String> 타입
		Stream<List<String>> s2 = Stream.of(list1, list2, list3);
		
		s2.flatMap(list -> {
			if(list.size() > 1) {
				return list.stream();
			}else {
				return Stream.empty();
			}
		}).forEach(Util::printWithParenthesis);
	}
}
