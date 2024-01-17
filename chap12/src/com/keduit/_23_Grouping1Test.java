package com.keduit;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _23_Grouping1Test {

	public static void main(String[] args) {
		
		Stream<Nation> sn = Nation.nations.stream().limit(4);
		
		Map<Type, List<Nation>> m1 = 
				sn.collect(Collectors.groupingBy(Nation::getType));
		
		System.out.println(m1);
		
		sn = Nation.nations.stream().limit(4);
		Map<Type, Long> m2 = sn.collect(Collectors.groupingBy(Nation::getType,
				Collectors.counting()));
		System.out.println(m2);

		sn = Nation.nations.stream().limit(4);
		
		Map<Type, String> m3 = sn.collect(Collectors.groupingBy(Nation::getType, 
				Collectors.mapping(Nation::getName, Collectors.joining("#"))));
		System.out.println(m3);
	}

}
