package com.keduit;

import java.util.Comparator;
import java.util.stream.Stream;

public class _16_sortedTest {

	public static void main(String[] args) {
		
		
		Stream<String> list = Stream.of("d1", "d3", "d2", "c1", "c3", "a1");

		list.sorted().forEach(Util::Print);
		System.out.println();
		
		System.out.println("국가 이름 순 정렬 : ");
		Stream<Nation> n = Nation.nations.stream();
		
		n.sorted(Comparator.comparing(Nation::getName))
		.forEach(Util::Print);
		
		System.out.println("\n국가 GDP순서 : ");
		n = Nation.nations.stream();
		
		n.sorted(Comparator.comparing(Nation::getGdpRank)).forEach(Util::Print);
	}

}
