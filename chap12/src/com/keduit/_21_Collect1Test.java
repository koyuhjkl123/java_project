package com.keduit;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _21_Collect1Test {

	public static void main(String[] args) {

		Stream<Nation> sn = Nation.nations.stream();
		Double avg = sn.collect(Collectors.averagingDouble(Nation::getPopulation));
		System.out.println("인구평균 : " + avg);

		sn = Nation.nations.stream();

		System.out.println("나라 개수 : " + sn.collect(Collectors.counting()));
		
		
		
		sn = Nation.nations.stream();
		
		String name = sn.limit(4).map(Nation::getName)
				.collect(Collectors.joining("-"));
		System.out.println("4개 나라 : " + name);
		
		sn = Nation.nations.stream();
		name = sn.limit(5).collect(Collectors.mapping(Nation::getName, Collectors.joining("+")));
		System.out.println("방법2 : " + name);
		
		sn = Nation.nations.stream();
		
		IntSummaryStatistics ist = sn.collect(
				Collectors.summarizingInt(x -> x.getGdpRank()));
		
		System.out.println(ist);
		
		
	}

}
